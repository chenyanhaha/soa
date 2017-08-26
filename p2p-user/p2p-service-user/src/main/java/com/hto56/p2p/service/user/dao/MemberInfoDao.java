package com.hto56.p2p.service.user.dao;

import java.util.List;

import com.hto56.p2p.api.user.entity.MemberInfo;
import com.hto56.p2p.common.core.dao.BaseDao;

public interface MemberInfoDao extends BaseDao<MemberInfo>{
	/**
	 * 根据身份证号码查询
	 * 
	 * @param cardNo
	 * @return
	 */
	List findByCardNo(String cardNo);

	
	/**
	 * 根据会员编号查询会员信息
	 * @param memberNo
	 * @return
	 * @throws BizException
	 */
	MemberInfo getMemberInfoByMemberNo(String memberNo);
	
/*	*//**
	 * 统计会员拉黑和冻结的人数
	 * @param listBlackUser
	 * @param listFreezeUser
	 * @return
	 *//*
	Map<String, Object> countMember(List<Map<String, Object>> listBlackUser,
			List<Map<String, Object>> listFreezeUser);
	*/
}
