package com.hto56.p2p.common.core.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import com.hto56.p2p.common.page.PageBean;
import com.hto56.p2p.common.page.PageParam;

public interface BaseDao <T>{

	/**
	 * ����ʵ�����������¼.
	 * 
	 * @param entity
	 *            .
	 * @return id .
	 */
	long insert(T entity);

	/**
	 * �����������.
	 * 
	 * @param entity
	 *            .
	 * @return id .
	 */
	long insert(List<T> list);

	/**
	 * ����ʵ���Ӧ�ļ�¼.
	 * 
	 * @param entity
	 *            .
	 * @return
	 */
	long update(T entity);

	/**
	 * �������¶���.
	 * 
	 * @param entity
	 *            .
	 * @return int .
	 */
	long update(List<T> list);

	/**
	 * ����ID���Ҽ�¼.
	 * 
	 * @param id
	 *            .
	 * @return entity .
	 */
	T getById(long id);

	/**
	 * ����IDɾ����¼.
	 * 
	 * @param id
	 *            .
	 * @return
	 */
	long deleteById(long id);

	/**
	 * ��ҳ��ѯ .
	 * 
	 * @param pageParam
	 *            ��ҳ����.
	 * @param paramMap
	 *            ҵ��������ѯ����.
	 * @return
	 */
	PageBean listPage(PageParam pageParam, Map<String, Object> paramMap);

	PageBean listPage(PageParam pageParam, Map<String, Object> paramMap, String sqlId);

	/**
	 * ����������ѯ listBy: <br/>
	 * 
	 * @param paramMap
	 * @return ���ؼ���
	 */
	List<T> listBy(Map<String, Object> paramMap);

	List<Object> listBy(Map<String, Object> paramMap, String sqlId);

	/**
	 * ����������ѯ listBy: <br/>
	 * 
	 * @param paramMap
	 * @return ����ʵ��
	 */
	T getBy(Map<String, Object> paramMap);

	Object getBy(Map<String, Object> paramMap, String sqlId);

	/**
	 * �����������ƻ�ȡ��һ��ֵ
	 * 
	 * @return
	 */
	String getSeqNextValue(String seqName);

	SqlSessionTemplate getSessionTemplate();

	SqlSession getSqlSession();
}
