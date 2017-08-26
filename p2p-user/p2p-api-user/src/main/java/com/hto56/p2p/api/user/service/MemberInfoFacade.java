package com.hto56.p2p.api.user.service;

import java.util.Map;

import com.hto56.p2p.api.user.entity.MemberInfo;
import com.hto56.p2p.api.user.exception.UserBizException;
import com.hto56.p2p.common.page.PageBean;
import com.hto56.p2p.common.page.PageParam;

public interface MemberInfoFacade {

	/**
	 * �����û����(Ҳ�ǻ�Ա���)��ѯ��Ա��Ϣ.
	 * @param userNo �û����(Ҳ�ǻ�Ա���).
	 * @return memberInfo ��ѯ���Ļ�Ա��Ϣ.
	 * @throws UserBizException
	 */
	public MemberInfo getMemberByUserNo(String userNo) throws UserBizException;

	
	/**
	 * ��ҳ��ѯ
	 * 
	 * @param pageParam
	 * @param paramMap
	 * @return
	 * @throws UserBizException
	 */
	
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) throws UserBizException;


	/**
	 * ���»�Ա��Ϣ.
	 * @param memberInfo ��Ա��Ϣ.
	 * @return result ���½��
	 * @throws UserBizException
	 */
	public long update(MemberInfo memberInfo) throws UserBizException;
	
	
	
	
	public MemberInfo getById(Long memberId) throws UserBizException;
	
	
	/**
	 * ͳ�ƻ�Ա���ںͶ��������
	 * @param listBlackUser
	 * @param listFreezeUser
	 * @return
	 *//*
	public Map<String, Object> countMember(
			List<Map<String, Object>> listBlackUser,
			List<Map<String, Object>> listFreezeUser) throws UserBizException;
*/

}
