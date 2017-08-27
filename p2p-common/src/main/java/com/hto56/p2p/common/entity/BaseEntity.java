package com.hto56.p2p.common.entity;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.JSON;

public class BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private Integer version;
	
	protected Date createTime = new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
	
	
	
	
}
