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
public class Result<T> {
	private boolean success;// 是否成功标志

	private T data;// 成功时返回的数据

	private String error;// 错误信息

	/**
	 * 
	 */
	public Result() {
		// TODO Auto-generated constructor stub
	}

	// 成功时的构造器
	public Result(boolean success, T data) {
		this.success = success;
		this.data = data;
	}

	// 错误时的构造器
	public Result(boolean success, String error) {
		this.success = success;
		this.error = error;
	}

}
