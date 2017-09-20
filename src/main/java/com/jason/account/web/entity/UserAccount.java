package com.jason.account.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by MengDexin.
 * Date : 17/9/19.
 * Time : 14:20.
 */
public class UserAccount implements Serializable{

	/**
	 * 默认序列化ID
	 */
	private static final long serialVersionUID = -508384354467455613L;

	/**
	 * 用户Id
	 */
	private int userId;

	/**
	 * 用户邮箱
	 */
	private String userEmail;

	/**
	 * 用户昵称
	 */
	private String userNickName;

	/**
	 * 手机号码
	 */
	private String mobile;

	/**
	 * 手机号码绑定状态
	 */
	private int mobileNoStatus;

	/**
	 * 邮箱验证状态
	 */
	private int emailStatus;
	
	/**
	 * 用户创建时间
	 */

	private Date userAddDate;
	
	/**
	 * 用户来源
	 */
	private int userSource;
	
	/**
	 * 用户密码修改次数
	 */
	private String userPW;
	
	// getter/setter

	public int getUserId() {
		return userId;
	}

	public UserAccount setUserId(int userId) {
		this.userId = userId;
		return this;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getMobileNoStatus() {
		return mobileNoStatus;
	}

	public void setMobileNoStatus(Integer mobileNoStatus) {
		this.mobileNoStatus = mobileNoStatus == null ? 0 : mobileNoStatus;
	}

	public int getEmailStatus() {
		return emailStatus;
	}

	public void setEmailStatus(Integer emailStatus) {
		this.emailStatus = emailStatus == null ? 0 : emailStatus;
	}

	public void setUserAddDate(Date userAddDate) {
		this.userAddDate = userAddDate;
	}

	public Date getUserAddDate() {
		return userAddDate;
	}

	public int getUserSource() {
		return userSource;
	}

	public void setUserSource(int userSource) {
		this.userSource = userSource;
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	
	
}
