package com.hto56.p2p.common.page;

import java.io.Serializable;

public class PageParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6297178964005032338L;
	private int pageNum; // ��ǰҳ��
	private int numPerPage; // ÿҳ��¼��
	
	public PageParam(int pageNum, int numPerPage) {
		super();
		this.pageNum = pageNum;
		this.numPerPage = numPerPage;
	}

	/** ��ǰҳ�� */
	public int getPageNum() {
		return pageNum;
	}

	/** ��ǰҳ�� */
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	/** ÿҳ��¼�� */
	public int getNumPerPage() {
		return numPerPage;
	}

	/** ÿҳ��¼�� */
	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}

	
	
}
