package com.hto56.p2p.api.user.exception;

import com.hto56.p2p.common.exceptions.BizException;

public class UserBizException extends BizException{
	
    private static final long serialVersionUID = -3175990411418914329L;
	
	/***
	 * ��¼���û���������
	 */
	public static final int LOGIN_LOGNAME_NOT_EXIST = 20020001;
	/***
	 * ��¼���������
	 */
	public static final int LOGIN_PWD_ERROR = 20020002;

	/***
	 * ��¼����������������
	 */
	public static final int LOGIN_PWDERRORTIMES_OVERRUN = 20020003;

	/***
	 * ��¼������Ա״̬Ϊ����
	 */
	public static final int LOGIN_OPERATORSTATUS_INACTIVE = 20020004;
	
	/***
	 * ��¼������Ա������
	 */
	public static final int LOGIN_OPERATORSTATUS_CANCELLATION = 20020005;

	/***
	 * �û��Ѵ���
	 */
	public static final int USERINFO_IS_EXIST = 20020006;

	/***
	 * �û�������
	 */
	public static final int USERINFO_NOT_IS_EXIST = 20020007;

	/**
	 * �̻����������ڽ���
	 */
	public static final int CELL_ORDE_IS_EXIST = 20020008;

	/**
	 * �̻������������
	 */
	public static final int CELL_BALANCE_MORETHAN_ONE = 20020009;

	/***
	 * ��û���޸ĳ�������Ա��Ȩ��
	 */
	public static final int USERINFO_NOT_EDIT_AUTHORITY = 20020010;

	/***
	 * �Ҳ���������userInfo
	 */
	public static final int NOT_FOUND_USERINFO = 20020012;

	/***
	 * �̻�������������������
	 */
	public static final int MERCHANT_BANK_BRANCH_IS_NULL = 20020013;

	/***
	 * �̻�ҵ��������Ϣ������
	 */
	public static final int MERCHANT_BUSI_SETTING_IS_NULL = 20020014;

	/***
	 * �̻��˿�������Ϣ������
	 */
	public static final int MERCHANT_REFUND_LIMIT_IS_NULL = 20020015;

	/***
	 * �̻�����������Ϣ������
	 */
	public static final int MERCHANT_TRADE_LIMIT_IS_NULL = 20020016;

	/***
	 * �̻���Ϣ������
	 */
	public static final int MERCHANT_IS_NULL = 20020017;

	/***
	 * �̻�������־��¼��Ϣ������
	 */
	public static final int MERCHANT_OPERATE_LOG_IS_NULL = 20020018;

	/***
	 * ��������Ϣ������
	 */
	public static final int AGENT_IS_NULL = 20020019;

	/***
	 * �̻������¼��Ϣ������
	 */
	public static final int MERCHANT_REQUEST_LOG_IS_NULL = 20020020;

	/***
	 * �����̷��ʲ�����
	 */
	public static final int AGENT_RATE_IS_NULL = 20020021;

	/***
	 * �����̷��ʵ�����¼������
	 */
	public static final int AGENT_RATE_ADJUST_LOG_IS_NULL = 20020022;

	/***
	 * �̻����ʼ�¼������
	 */
	public static final int MERCHANT_RATE_IS_NULL = 20020023;

	/***
	 * �̻����ʵ�����¼������
	 */
	public static final int MERCHANT_RATE_ADJUST_LOG_IS_NULL = 20020024;

	/***
	 * �̻����ݷ���Ϊ��
	 */
	public static final int MERCHANT_STEP_RATE_IS_NULL = 20020025;

	/***
	 * �̻����ݷ�����־������
	 */
	public static final int MERCHANT_STEP_RATE_ADJUST_LOG_IS_NULL = 20020026;

	/***
	 * ���û��Ѵ���
	 */
	public static final int MERCHANT_USERINFO_IS_EXIST = 20020027;

	/***
	 * ���û�������
	 */
	public static final int MERCHANT_USERINFO_NOT_EXIST = 20020028;

	/**
	 * ��¼�������
	 */
	public static final int LOGPWD_ERROR = 20020029;

	/**
	 * �������벻����
	 */
	public static final int USER_TRADEPWD_NOT_EXIT = 20020030;

	/**
	 * �û������������
	 */
	public static final int USER_TRADEPWD_ERROR = 20020031;

	/**
	 * ����������������������
	 */
	public static final int USER_TRADEPWD_ERROR_TIMES_OUTLIMIT = 20020032;

	/**
	 * ʵ����֤����˼�¼������
	 */
	public static final int USER_AUDIT_RECORD_REALNAME_IS_NULL = 20020033;

	/**
	 * �û�״̬����˼�¼������
	 */
	public static final int USER_AUDIT_RECORD_STATUS_IS_NULL = 20020034;

	/**
	 * �û���������˼�¼������
	 */
	public static final int USER_AUDIT_RECORD_CLOSE_IS_NULL = 20020035;

	/**
	 * �ϴ����δ�������
	 */
	public static final int USER_LAST_USERAUDIT_IS_NOT_FINISHED = 20020036;

	/**
	 * �û��Ѿ�ʵ����֤
	 */
	public static final int USER_REALNAMEED_IS_CHECKED = 20020037;

	/**
	 * �û�δ��ͨ�տ��
	 */
	public static final int MERCHANT_BUSI_SETTING_PAY_IS_NOT_EXIST = 20020038;
	
	/***
	 * ��Ա��ϢΪ��
	 */
	public static final int MEMBER_INFO_IS_NULL = 20020039;
	
	/***
	 * �����˻���Ϣ������
	 */
	public static final int USER_BANK_ACCOUNT_IS_NULL = 20020040;
	
	/***
	 * �̻������ļ���Ϣ������.
	 */
	public static final int MERCHANT_FILE_IS_NULL = 20020041;
	
	/***
	 * �������̻���ϵ��Ϣ������.
	 */
	public static final int AGENT_MERCHANT_RELATION_IS_NULL = 20020042;
	
	/***
	 * �û�����Ա��Ϣ������
	 */
	public static final int USER_OPERATOR_IS_NULL = 20020043;
	
	/***
	 * �̻���ԿΪ��
	 */
	public static final int MERCHANT_KEY_IS_NULL = 20020044;
	/***
	 * ����ƽ̨��˽Կ����
	 */
	public static final int GENERATE_PLATE_KEY_FAIL = 20020045;
	
	/**
	 * �̻���ԿΪ��
	 */
	public static final int MERCHANT_PUBLICKEY_IS_NULL = 20020046;
	
	/**
	 * �̻�ǩ����������
	 */
	public static final int MERCHANT_SIGNTYPE_ERR = 20020047;

	/***
	 * �û����Ϊ��
	 */
	public static final int USER_NO_IS_NULL = 20020048;

	public UserBizException() {
	}

	public UserBizException(int code, String msgFormat, Object... args) {
		super(code, msgFormat, args);
	}

	public UserBizException(int code, String msg) {
		super(code, msg);
	}

}
