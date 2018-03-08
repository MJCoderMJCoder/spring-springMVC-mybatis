/**
 * 
 */
package com.lzf.dto;

/**
 * 封装json对象，所有返回结果都使用它
 * 
 * @author MJCoder
 *
 */
public class Result {
	private boolean success;// 是否成功标志

	private String describe;// 返回的详细信息描述

	private Object data;// 成功时返回的数据

	/**
	 * @param success
	 * @param describe
	 * @param data
	 */
	public Result(boolean success, String describe, Object data) {
		this.success = success;
		this.describe = describe;
		this.data = data;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success
	 *            the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the describe
	 */
	public String getDescribe() {
		return describe;
	}

	/**
	 * @param describe
	 *            the describe to set
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Result [success=" + success + ", describe=" + describe + ", data=" + data + "]";
	}

}
