package com.mydemo.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回码定义。
 */
public class RetCode {

	public static final int FLAG_SUCCESS = 0;
	public static final int FLAG_FAIL = -1;
	public static final int FLAG_IDEAL_FAIL = 9999;
	public static final int FLAG_UN_LOGIN = -2;
	/** 无权限 */
	public static final int FLAG_NO_AUTHORIZED = -3;

	public static final int U_1001 = 1001; // 
	public static final int U_1002 = 1002; // 
	
	private static Map<Object, String> FLAG_MAP = new HashMap<Object, String>();
	
	static {
		FLAG_MAP.put(FLAG_SUCCESS, "操作成功");
		FLAG_MAP.put(FLAG_FAIL, "操作失败");
		FLAG_MAP.put(FLAG_IDEAL_FAIL, "登录失败");
		FLAG_MAP.put(FLAG_UN_LOGIN, "用户未登陆");
		FLAG_MAP.put(FLAG_NO_AUTHORIZED, "权限不足");
	}
	
	/**
	 * 获取返回码对应的MSG
	 * @author ZHANGZHENWEI 2016-8-5
	 * @param code
	 * @return  
	 */
	public static String GetMsg(Object code) {
		return FLAG_MAP.get(code);
	}
}
