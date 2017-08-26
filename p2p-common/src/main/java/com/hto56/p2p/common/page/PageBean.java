package com.hto56.p2p.common.page;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class PageBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8470697978259453214L;
	
	// ָ���Ļ���ҳ�����
	private int currentPage; // ��ǰҳ
	private int numPerPage; // ÿҳ��ʾ������

	// ��ѯ���ݿ�
	private int totalCount; // �ܼ�¼��
	private List<Object> recordList; // ��ҳ�������б�

	// ����
	private int pageCount; // ��ҳ��
	private int beginPageIndex; // ҳ���б�Ŀ�ʼ������������
	private int endPageIndex; // ҳ���б�Ľ���������������
	
	private Map<String, Object> countResultMap; // ��ǰ��ҳ�����µ�ͳ�ƽ��
	
	
	public PageBean(){}
	
	/**
	 * ֻ����ǰ4����Ҫ�����ԣ����Զ��ļ��������3��������ֵ
	 * 
	 * @param currentPage
	 * @param pageSize
	 * @param totalCount
	 * @param recordList
	 */
	public PageBean(int currentPage, int numPerPage, int totalCount, List<Object> recordList) {
		this.currentPage = currentPage;
		this.numPerPage = numPerPage;
		this.totalCount = totalCount;
		this.recordList = recordList;

		// ������ҳ��
		pageCount = (totalCount + numPerPage - 1) / numPerPage;

		// ���� beginPageIndex �� endPageIndex
		// >> ��ҳ��������10ҳ����ȫ����ʾ
		if (pageCount <= 10) {
			beginPageIndex = 1;
			endPageIndex = pageCount;
		}
		// >> ��ҳ������10ҳ������ʾ��ǰҳ�����Ĺ�10��ҳ��
		else {
			// ��ǰҳ�����Ĺ�10��ҳ�루ǰ4�� + ��ǰҳ + ��5����
			beginPageIndex = currentPage - 4;
			endPageIndex = currentPage + 5;
			// ��ǰ���ҳ�벻��4��ʱ������ʾǰ10��ҳ��
			if (beginPageIndex < 1) {
				beginPageIndex = 1;
				endPageIndex = 10;
			}
			// �������ҳ�벻��5��ʱ������ʾ��10��ҳ��
			if (endPageIndex > pageCount) {
				endPageIndex = pageCount;
				beginPageIndex = pageCount - 10 + 1;
			}
		}
	}
	
	/**
	 * ֻ����ǰ5����Ҫ�����ԣ����Զ��ļ��������3��������ֵ
	 * 
	 * @param currentPage
	 * @param pageSize
	 * @param totalCount
	 * @param recordList
	 */
	public PageBean(int currentPage, int numPerPage, int totalCount, List<Object> recordList, Map<String, Object> countResultMap) {
		this.currentPage = currentPage;
		this.numPerPage = numPerPage;
		this.totalCount = totalCount;
		this.recordList = recordList;
		this.countResultMap = countResultMap;

		// ������ҳ��
		pageCount = (totalCount + numPerPage - 1) / numPerPage;

		// ���� beginPageIndex �� endPageIndex
		// >> ��ҳ��������10ҳ����ȫ����ʾ
		if (pageCount <= 10) {
			beginPageIndex = 1;
			endPageIndex = pageCount;
		}
		// >> ��ҳ������10ҳ������ʾ��ǰҳ�����Ĺ�10��ҳ��
		else {
			// ��ǰҳ�����Ĺ�10��ҳ�루ǰ4�� + ��ǰҳ + ��5����
			beginPageIndex = currentPage - 4;
			endPageIndex = currentPage + 5;
			// ��ǰ���ҳ�벻��4��ʱ������ʾǰ10��ҳ��
			if (beginPageIndex < 1) {
				beginPageIndex = 1;
				endPageIndex = 10;
			}
			// �������ҳ�벻��5��ʱ������ʾ��10��ҳ��
			if (endPageIndex > pageCount) {
				endPageIndex = pageCount;
				beginPageIndex = pageCount - 10 + 1;
			}
		}
	}

	public List<Object> getRecordList() {
		return recordList;
	}

	public void setRecordList(List<Object> recordList) {
		this.recordList = recordList;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getBeginPageIndex() {
		return beginPageIndex;
	}

	public void setBeginPageIndex(int beginPageIndex) {
		this.beginPageIndex = beginPageIndex;
	}

	public int getEndPageIndex() {
		return endPageIndex;
	}

	public void setEndPageIndex(int endPageIndex) {
		this.endPageIndex = endPageIndex;
	}

	public Map<String, Object> getCountResultMap() {
		return countResultMap;
	}

	public void setCountResultMap(Map<String, Object> countResultMap) {
		this.countResultMap = countResultMap;
	}

	
	
}
