package com.hto56.p2p.common.core.service;

import java.util.List;
import java.util.Map;

import com.hto56.p2p.common.core.dao.BaseDao;
import com.hto56.p2p.common.entity.BaseEntity;
import com.hto56.p2p.common.page.PageBean;
import com.hto56.p2p.common.page.PageParam;



/**
 * Service 鍩虹被瀹炵幇
 * 
 * @author Hill
 * 
 * @param <T>
 */
public abstract class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {

	protected abstract BaseDao<T> getDao();

	public T getById(long id) {
		return this.getDao().getById(id);
	}

	/**
	 * 鍒嗛〉鏌ヨ .
	 * 
	 * @param pageParam
	 *            鍒嗛〉鍙傛暟.
	 * @param paramMap
	 *            涓氬姟鏉′欢鏌ヨ鍙傛暟.
	 * @return
	 */
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return this.getDao().listPage(pageParam, paramMap);
	}

	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap, String sqlId) {
		return this.getDao().listPage(pageParam, paramMap, sqlId);
	}

	/**
	 * 鏍规嵁鏉′欢鏌ヨ listBy: <br/>
	 * 
	 * @param paramMap
	 * @return 杩斿洖闆嗗悎
	 */
	public List<T> listBy(Map<String, Object> paramMap) {
		return this.getDao().listBy(paramMap);
	}

	public List<Object> listBy(Map<String, Object> paramMap, String sqlId) {
		return this.getDao().listBy(paramMap, sqlId);
	}

	/**
	 * 鏍规嵁鏉′欢鏌ヨ listBy: <br/>
	 * 
	 * @param paramMap
	 * @return 杩斿洖瀹炰綋
	 */
	public T getBy(Map<String, Object> paramMap) {
		return this.getDao().getBy(paramMap);
	}

	public Object getBy(Map<String, Object> paramMap, String sqlId) {
		return this.getDao().getBy(paramMap, sqlId);
	}

	/**
	 * 鏍规嵁搴忓垪鍚嶇О鑾峰彇涓嬩竴涓��
	 * 
	 * @return
	 */
	public String getSeqNextValue(String seqName) {
		return this.getDao().getSeqNextValue(seqName);
	}

}
