package com.hto56.p2p.common.core.service;

import java.util.List;
import java.util.Map;

import com.hto56.p2p.common.entity.BaseEntity;
import com.hto56.p2p.common.page.PageBean;
import com.hto56.p2p.common.page.PageParam;



/**
 * 鍩虹被Service鎺ュ彛
 * 
 * @author Hill
 * 
 * @param <T>
 */
public interface BaseService<T extends BaseEntity> {

	/**
	 * 鏍规嵁ID鏌ユ壘璁板綍.
	 * 
	 * @param id
	 *            .
	 * @return entity .
	 */
	T getById(long id);
	
	/**
	 * 鍒嗛〉鏌ヨ .
	 * 
	 * @param pageParam
	 *            鍒嗛〉鍙傛暟.
	 * @param paramMap
	 *            涓氬姟鏉′欢鏌ヨ鍙傛暟.
	 * @return
	 */
	PageBean listPage(PageParam pageParam, Map<String, Object> paramMap);

	PageBean listPage(PageParam pageParam, Map<String, Object> paramMap, String sqlId);

	/**
	 * 鏍规嵁鏉′欢鏌ヨ listBy: <br/>
	 * 
	 * @param paramMap
	 * @return 杩斿洖闆嗗悎
	 */
	List<T> listBy(Map<String, Object> paramMap);

	List<Object> listBy(Map<String, Object> paramMap, String sqlId);

	/**
	 * 鏍规嵁鏉′欢鏌ヨ listBy: <br/>
	 * 
	 * @param paramMap
	 * @return 杩斿洖瀹炰綋
	 */
	T getBy(Map<String, Object> paramMap);

	Object getBy(Map<String, Object> paramMap, String sqlId);

	/**
	 * 鏍规嵁搴忓垪鍚嶇О鑾峰彇涓嬩竴涓��
	 * 
	 * @return
	 */
	String getSeqNextValue(String seqName);

}
