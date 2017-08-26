package com.hto56.p2p.common.core.dao;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.jdbc.SqlRunner;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.druid.pool.DruidDataSource;
import com.hto56.p2p.common.core.mybatis.interceptor.ExecutorInterceptor;
import com.hto56.p2p.common.entity.BaseEntity;
import com.hto56.p2p.common.exceptions.BizException;
import com.hto56.p2p.common.page.PageBean;
import com.hto56.p2p.common.page.PageParam;



/**
 * 
 * @param <T>
 */
public abstract class BaseDaoImpl<T extends BaseEntity> extends SqlSessionDaoSupport implements BaseDao<T> {

	protected static final Logger log = LoggerFactory.getLogger(BaseDaoImpl.class);

	public static final String SQL_INSERT = "insert";
	public static final String SQL_BATCH_INSERT = "batchInsert";
	public static final String SQL_UPDATE = "update";
	public static final String SQL_GET_BY_ID = "getById";
	public static final String SQL_DELETE_BY_ID = "deleteById";
	public static final String SQL_LIST_PAGE = "listPage";
	public static final String SQL_LIST_BY = "listBy";
	public static final String SQL_COUNT_BY_PAGE_PARAM = "countByPageParam"; // 鏍规嵁褰撳墠鍒嗛〉鍙傛暟杩涜缁熻

	/**
	 * 娉ㄥ叆SqlSessionTemplate瀹炰緥(瑕佹眰Spring涓繘琛孲qlSessionTemplate鐨勯厤缃�).<br/>
	 * 鍙互璋冪敤sessionTemplate瀹屾垚鏁版嵁搴撴搷浣�.
	 */
	@Autowired
	private SqlSessionTemplate sessionTemplate;

	@Autowired
	protected SqlSessionFactory sqlSessionFactory;

	@Autowired
	private DruidDataSource druidDataSource;

	public SqlSessionTemplate getSessionTemplate() {
		return sessionTemplate;
	}

	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}

	public SqlSession getSqlSession() {
		return super.getSqlSession();
	}

	public long insert(T t) {

		if (t == null)
			throw new RuntimeException("T is null");

		int result = sessionTemplate.insert(getStatement(SQL_INSERT), t);

		if (result <= 0)
			throw BizException.DB_INSERT_RESULT_0;

		if (t != null && t.getId() != null && result > 0)
			return t.getId();

		return result;
	}

	public long insert(List<T> list) {

		if (list == null || list.size() <= 0)
			return 0;

		int result = sessionTemplate.insert(getStatement(SQL_BATCH_INSERT), list);

		if (result <= 0)
			throw BizException.DB_INSERT_RESULT_0;

		return result;
	}

	public long update(T t) {
		if (t == null)
			throw new RuntimeException("T is null");

		int result = sessionTemplate.update(getStatement(SQL_UPDATE), t);

		if (result <= 0)
			throw BizException.DB_UPDATE_RESULT_0;

		return result;
	}

	public long update(List<T> list) {

		if (list == null || list.size() <= 0)
			return 0;

		int result = 0;

		for (int i = 0; i < list.size(); i++) {
			this.update(list.get(i));
			result += 1;
		}

		if (result <= 0)
			throw BizException.DB_UPDATE_RESULT_0;

		return result;
	}

	public T getById(long id) {
		return sessionTemplate.selectOne(getStatement(SQL_GET_BY_ID), id);
	}

	public long deleteById(long id) {
		return (long) sessionTemplate.delete(getStatement(SQL_DELETE_BY_ID), id);
	}

	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap, String sqlId) {

		if (paramMap == null)
			paramMap = new HashMap<String, Object>();

		// 鑾峰彇鍒嗛〉鏁版嵁闆� , 娉ㄥ垏鍕挎崲鎴� sessionTemplate 瀵硅薄
		List<Object> list = getSqlSession().selectList(getStatement(sqlId), paramMap,
				new RowBounds((pageParam.getPageNum() - 1) * pageParam.getNumPerPage(), pageParam.getNumPerPage()));

		// 缁熻鎬昏褰曟暟
		Object countObject = (Object) getSqlSession().selectOne(getStatement(sqlId), new ExecutorInterceptor.CountParameter(paramMap));
		Long count = Long.valueOf(countObject.toString());

		return new PageBean(pageParam.getPageNum(), pageParam.getNumPerPage(), count.intValue(), list);
	}

	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {

		if (paramMap == null)
			paramMap = new HashMap<String, Object>();

		// 鑾峰彇鍒嗛〉鏁版嵁闆� , 娉ㄥ垏鍕挎崲鎴� sessionTemplate 瀵硅薄
		List<Object> list = getSqlSession().selectList(getStatement(SQL_LIST_PAGE), paramMap,
				new RowBounds((pageParam.getPageNum() - 1) * pageParam.getNumPerPage(), pageParam.getNumPerPage()));

		// 缁熻鎬昏褰曟暟
		Object countObject = (Object) getSqlSession().selectOne(getStatement(SQL_LIST_PAGE),
				new ExecutorInterceptor.CountParameter(paramMap));
		Long count = Long.valueOf(countObject.toString());

		// 鏄惁缁熻褰撳墠鍒嗛〉鏉′欢涓嬬殑鏁版嵁锛�1:鏄紝鍏朵粬涓哄惁
		Object isCount = paramMap.get("isCount");
		if (isCount != null && "1".equals(isCount.toString())) {
			Map<String, Object> countResultMap = sessionTemplate.selectOne(getStatement(SQL_COUNT_BY_PAGE_PARAM), paramMap);
			return new PageBean(pageParam.getPageNum(), pageParam.getNumPerPage(), count.intValue(), list, countResultMap);
		} else {
			return new PageBean(pageParam.getPageNum(), pageParam.getNumPerPage(), count.intValue(), list);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<T> listBy(Map<String, Object> paramMap) {
		return (List) this.listBy(paramMap, SQL_LIST_BY);
	}

	public List<Object> listBy(Map<String, Object> paramMap, String sqlId) {
		if (paramMap == null)
			paramMap = new HashMap<String, Object>();

		return sessionTemplate.selectList(getStatement(sqlId), paramMap);
	}

	@SuppressWarnings("unchecked")
	public T getBy(Map<String, Object> paramMap) {
		return (T) this.getBy(paramMap, SQL_LIST_BY);
	}

	public Object getBy(Map<String, Object> paramMap, String sqlId) {
		if (paramMap == null || paramMap.isEmpty())
			return null;

		return this.getSqlSession().selectOne(getStatement(sqlId), paramMap);
	}

	public String getStatement(String sqlId) {

		String name = this.getClass().getName();

		StringBuffer sb = new StringBuffer().append(name).append(".").append(sqlId);

		return sb.toString();
	}

	/**
	 * 鏍规嵁搴忓垪鍚嶇О,鑾峰彇搴忓垪鍊�
	 */
	public String getSeqNextValue(String seqName) {
		boolean isClosedConn = false;
		// 鑾峰彇褰撳墠绾跨▼鐨勮繛鎺�
		Connection connection = this.sessionTemplate.getConnection();
		// 鑾峰彇Mybatis鐨凷QLRunner绫�
		SqlRunner sqlRunner = null;
		try {
			// 瑕佹墽琛岀殑SQL
			String sql = "";
			// 鏁版嵁搴撻┍鍔ㄧ被
			String driverClass = druidDataSource.getDriver().getClass().getName();
			// 涓嶅悓鐨勬暟鎹簱,鎷兼帴SQL璇彞
			if (driverClass.equals("com.ibm.db2.jcc.DB2Driver")) {
				sql = "  VALUES " + seqName.toUpperCase() + ".NEXTVAL";
			}
			if (driverClass.equals("oracle.jdbc.OracleDriver")) {
				sql = "SELECT " + seqName.toUpperCase() + ".NEXTVAL FROM DUAL";
			}
			if (driverClass.equals("com.mysql.jdbc.Driver")) {
				sql = "SELECT  FUN_SEQ('" + seqName.toUpperCase() + "')";
			}
			// 濡傛灉鐘舵�佷负鍏抽棴,鍒欓渶瑕佷粠鏂版墦寮�涓�涓繛鎺�
			if (connection.isClosed()) {
				connection = sqlSessionFactory.openSession().getConnection();
				isClosedConn = true;
			}
			sqlRunner = new SqlRunner(connection);
			Object[] args = {};
			// 鎵цSQL璇彞
			Map<String, Object> params = sqlRunner.selectOne(sql, args);
			for (Object o : params.values()) {
				return o.toString();
			}
			return null;
		} catch (Exception e) {
			throw BizException.DB_GET_SEQ_NEXT_VALUE_ERROR.newInstance("鑾峰彇搴忓垪鍑虹幇閿欒!搴忓垪鍚嶇О:{%s}", seqName);
		} finally {
			if (isClosedConn) {
				sqlRunner.closeConnection();
			}
		}
	}
}
