package com.hto56.p2p.service.user.biz;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hto56.p2p.api.user.entity.MemberInfo;
import com.hto56.p2p.api.user.exception.UserBizException;
import com.hto56.p2p.api.user.service.MemberInfoFacade;
import com.hto56.p2p.common.page.PageBean;
import com.hto56.p2p.common.page.PageParam;
import com.hto56.p2p.service.user.dao.MemberInfoDao;

@Component("memberInfoFacade")
public class MemberInfoFacadeImpl implements MemberInfoFacade{

	
	@Autowired
	private MemberInfoDao memberInfoDao;
	
	public MemberInfo getMemberByUserNo(String userNo) throws UserBizException {
		return memberInfoDao.getMemberInfoByMemberNo(userNo);
	}

	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) throws UserBizException {
		return memberInfoDao.listPage(pageParam, paramMap);
	}

	public long update(MemberInfo memberInfo) throws UserBizException {
		return memberInfoDao.update(memberInfo);
	}

	public MemberInfo getById(Long memberId)  {
		return memberInfoDao.getById(memberId);
	}
}
