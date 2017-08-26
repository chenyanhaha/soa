package com.hto56.p2p.api.user.service;

import java.util.Map;

import com.hto56.p2p.api.user.entity.MemberInfo;
import com.hto56.p2p.api.user.exception.UserBizException;
import com.hto56.p2p.common.page.PageBean;
import com.hto56.p2p.common.page.PageParam;

public interface MemberInfoFacade {

	/**
	 * 根据用户编号(也是会员编号)查询会员信息.
	 * @param userNo 用户编号(也是会员编号).
	 * @return memberInfo 查询到的会员信息.
	 * @throws UserBizException
	 */
	public MemberInfo getMemberByUserNo(String userNo) throws UserBizException;

	
	/**
	 * 分页查询
	 * 
	 * @param pageParam
	 * @param paramMap
	 * @return
	 * @throws UserBizException
	 */
	
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) throws UserBizException;


	/**
	 * 更新会员信息.
	 * @param memberInfo 会员信息.
	 * @return result 更新结果
	 * @throws UserBizException
	 */
	public long update(MemberInfo memberInfo) throws UserBizException;
	
	
	
	
	public MemberInfo getById(Long memberId) throws UserBizException;
	
	
	/**
	 * 统计会员拉黑和冻结的人数
	 * @param listBlackUser
	 * @param listFreezeUser
	 * @return
	 *//*
	public Map<String, Object> countMember(
			List<Map<String, Object>> listBlackUser,
			List<Map<String, Object>> listFreezeUser) throws UserBizException;
*/

}
