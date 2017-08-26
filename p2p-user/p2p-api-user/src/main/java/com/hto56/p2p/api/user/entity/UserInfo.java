package com.hto56.p2p.api.user.entity;

import com.hto56.p2p.common.entity.BaseEntity;

public class UserInfo extends BaseEntity{

	private String accountNo;
	
	private String userNo;
	
	private String loginName;
	
	private Integer userType;
	
	private String greeting;
	
	private String question;
	
	private String answer;
	
	private String bindMobileNo;
	
	private String bindEmail;
	
	private String province;
	
	private String city;
	
	private String area;
	
	private String realName;
	
	private String cardNo;
	
	private Integer status;
	
	private Integer isEmailAuth;
	
	private Integer isMobileAuth;
	
	private Integer isRealNameAuth;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getBindMobileNo() {
		return bindMobileNo;
	}

	public void setBindMobileNo(String bindMobileNo) {
		this.bindMobileNo = bindMobileNo;
	}

	public String getBindEmail() {
		return bindEmail;
	}

	public void setBindEmail(String bindEmail) {
		this.bindEmail = bindEmail;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsEmailAuth() {
		return isEmailAuth;
	}

	public void setIsEmailAuth(Integer isEmailAuth) {
		this.isEmailAuth = isEmailAuth;
	}

	public Integer getIsMobileAuth() {
		return isMobileAuth;
	}

	public void setIsMobileAuth(Integer isMobileAuth) {
		this.isMobileAuth = isMobileAuth;
	}

	public Integer getIsRealNameAuth() {
		return isRealNameAuth;
	}

	public void setIsRealNameAuth(Integer isRealNameAuth) {
		this.isRealNameAuth = isRealNameAuth;
	}
	
	
	
	
	
}
