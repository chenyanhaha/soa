package com.hto56.p2p.common.exceptions;

public class BizException extends RuntimeException{
	
	private static final long serialVersionUID = -5875371379845226068L;

	/**
	 * ���ݿ����,insert����0
	 */
	public static final BizException DB_INSERT_RESULT_0 = new BizException(90040001, "���ݿ����,insert����0");

	/**
	 * ���ݿ����,update����0
	 */
	public static final BizException DB_UPDATE_RESULT_0 = new BizException(90040002, "���ݿ����,update����0");

	/**
	 * ���ݿ����,selectOne����null
	 */
	public static final BizException DB_SELECTONE_IS_NULL = new BizException(90040003, "���ݿ����,selectOne����null");

	/**
	 * ���ݿ����,list����null
	 */
	public static final BizException DB_LIST_IS_NULL = new BizException(90040004, "���ݿ����,list����null");

	/**
	 * Token ��֤��ͨ��
	 */
	public static final BizException TOKEN_IS_ILLICIT = new BizException(90040005, "Token ��֤�Ƿ�");
	/**
	 * �Ự��ʱ����ȡsessionʱ������ǿգ�throws ��������쳣 �����������ر��Ự��ʱҳ��
	 */
	public static final BizException SESSION_IS_OUT_TIME = new BizException(90040006, "�Ự��ʱ");

	/**
	 * ��ȡ���г���
	 */
	public static final BizException DB_GET_SEQ_NEXT_VALUE_ERROR = new BizException(90040007, "��ȡ���г���");

	/**
	 * �쳣��Ϣ
	 */
	protected String msg;

	/**
	 * �����쳣��
	 */
	protected int code;

	public BizException(int code, String msgFormat, Object... args) {
		super(String.format(msgFormat, args));
		this.code = code;
		this.msg = String.format(msgFormat, args);
	}

	public BizException() {
		super();
	}

	public String getMsg() {
		return msg;
	}

	public int getCode() {
		return code;
	}

	/**
	 * ʵ�����쳣
	 * 
	 * @param msgFormat
	 * @param args
	 * @return
	 */
	public BizException newInstance(String msgFormat, Object... args) {
		return new BizException(this.code, msgFormat, args);
	}

	public BizException(String message, Throwable cause) {
		super(message, cause);
	}

	public BizException(Throwable cause) {
		super(cause);
	}

	public BizException(String message) {
		super(message);
	}
	

}
