package com.mydemo.common;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 接口统一返回格式。
 */
@Getter
@Setter
public class Result<T> {

	@ApiModelProperty(value = "返回码", example = RetCode.FLAG_SUCCESS + "")
	private int flag;

	@ApiModelProperty(value = "返回消息", example = "操作成功")
	private String msg;
	
	@ApiModelProperty("数据内容")
	private T data;
	
	@ApiModelProperty(value = "服务器时间", example = "2018-01-01 08:00:00")
	private Date serverTime = new Date();
	
	private Result(int flag, String msg) {
		this.flag = flag;
		this.msg = msg;
	}

	private Result(int flag, T data) {
		this.flag = flag;
		this.data = data;
	}
	
	private Result(int flag, String msg, T data) {
		this(flag, msg);
		this.data = data;
	}
	
	public static <T> Result<T> respSuccess() {
		return new Result<T>(RetCode.FLAG_SUCCESS, RetCode.GetMsg(RetCode.FLAG_SUCCESS));
	}

	public static <T> Result<T> respSuccess(T data) {
		return new Result<T>(RetCode.FLAG_SUCCESS, RetCode.GetMsg(RetCode.FLAG_SUCCESS), data);
	}
	
	public static <T> Result<T> respFail() {
		return new Result<T>(RetCode.FLAG_FAIL, RetCode.GetMsg(RetCode.FLAG_FAIL));
	}
	
	public static <T> Result<T> respIDealFail() {
		return new Result<T>(RetCode.FLAG_IDEAL_FAIL, RetCode.GetMsg(RetCode.FLAG_IDEAL_FAIL));
	}
	
	public static <T> Result<T> respFail(String msg) {
		return new Result<T>(RetCode.FLAG_FAIL, msg);
	}

	public static <T> Result<T> respFail(T data) {
		return new Result<T>(RetCode.FLAG_FAIL, RetCode.GetMsg(RetCode.FLAG_FAIL), data);
	}

	public static <T> Result<T> respFail(String msg, T data) {
		return new Result<T>(RetCode.FLAG_FAIL, msg, data);
	}

	public static <T> Result<T> respFor(int flag, String msg, T data) {
		return new Result<T>(flag, msg, data);
	}
	
	public static <T> Result<T> respUnLogin() {
		return new Result<T>(RetCode.FLAG_UN_LOGIN, RetCode.GetMsg(RetCode.FLAG_UN_LOGIN));
	}

	/**
	 * 返回无权限
	 * @param <T>
	 * @return
	 */
	public static <T> Result<T> respNoAuthorized() {
		return new Result<T>(RetCode.FLAG_NO_AUTHORIZED, RetCode.GetMsg(RetCode.FLAG_NO_AUTHORIZED));
	}

	public static <T> Result<T> respNoAuthorized(String msg) {
		return new Result<T>(RetCode.FLAG_NO_AUTHORIZED, msg);
	}
	
}
