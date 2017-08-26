package com.hto56.p2p.web.cms.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hto56.p2p.api.user.entity.MemberInfo;
import com.hto56.p2p.api.user.service.MemberInfoFacade;

@RestController
public class MemberInfoController {
	
	@Reference(check=false)
	private MemberInfoFacade memberInfoFacade;

	@RequestMapping("/member/{id}")
	public String getById(@PathVariable("id")Long id){
		MemberInfo memberInfo = memberInfoFacade.getById(id);
		return memberInfo+"";
	}
	
	
	
}
