package com.hto56.p2p.service.user.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hto56.p2p.api.user.entity.MemberInfo;
import com.hto56.p2p.common.core.dao.BaseDaoImpl;
import com.hto56.p2p.service.user.dao.MemberInfoDao;

@Repository("memberInfoDao")
public class MemberInfoDaoImpl extends BaseDaoImpl<MemberInfo> implements MemberInfoDao{
	
	
	public List findByCardNo(String cardNo) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("cardNo", cardNo);
		return listBy(params);
	}

	public MemberInfo getMemberInfoByMemberNo(String memberNo) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("memberNo", memberNo);
		return super.getBy(map);
	}

}
