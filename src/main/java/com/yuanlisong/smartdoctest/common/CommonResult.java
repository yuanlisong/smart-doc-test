package com.yuanlisong.smartdoctest.common;

/**
 * CommonResult   
 * @ClassName CommonResult
 * @Description TODO
 * @author YuanLiSong 2021/11/2 9:45
 * @Copyright: YuanLiSong
 */
public class CommonResult<T> {
	/**
	 * 响应码
	 * @mock 200
	 */
	private Integer code;
	/**
	 * 响应信息
	 * @mock ok
	 */
	private String message;
	/**
	 * 返回数据体
	 */
	private T data;

	public CommonResult() {
	}

	public CommonResult(Integer code, String message) {
		this.code = code;
		this.message = message;
		this.data = null;
	}

	public CommonResult(Integer code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "CommonResult{" +
				"code=" + code +
				", message='" + message + '\'' +
				", data=" + data +
				'}';
	}
}
