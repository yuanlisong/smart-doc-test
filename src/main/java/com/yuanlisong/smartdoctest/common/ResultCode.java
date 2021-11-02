package com.yuanlisong.smartdoctest.common;

/**
 * ResultCode   
 * @ClassName ResultCode
 * @Description TODO
 * @author YuanLiSong 2021/11/2 10:09
 * @Copyright: YuanLiSong
 */
public enum ResultCode {

	RETURN_SUCCESS(200, "成功"),
	RETURN_ERRORS(500, "服务器内部异常"),
	RETURN_NOTFOUND(404, "访问找不到");

	private Integer code;

	private String desc;

	ResultCode(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "ResultCode{" +
				"code=" + code +
				", desc='" + desc + '\'' +
				'}';
	}
}
