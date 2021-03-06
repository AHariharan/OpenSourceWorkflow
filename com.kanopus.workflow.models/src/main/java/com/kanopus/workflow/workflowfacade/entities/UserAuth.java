package com.kanopus.workflow.workflowfacade.entities;

// default package
// Generated Aug 13, 2015 10:58:17 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * UserAuth generated by hbm2java
 */
public class UserAuth implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -259081322044950647L;
	private String id;
//	private UserRole userRole;
	private String emailAddress;
	private String password;
	private String workflowRefUserid;
	private Boolean isActive;
	private Boolean isExpired;
	private Boolean isSuspended;
	private Date createdDate;
	private Date updatedDate;
	private Boolean isAuthorizationOnly;

	public UserAuth() {
	}

//	public UserAuth(UserRole userRole) {
//		this.userRole = userRole;
//	}
	
	public UserAuth(String id, String emailAddress, String password,
			String workflowRefUserid, Boolean isActive, Boolean isExpired,
			Boolean isSuspended, Boolean isAuthorizationOnly) {
		this.id = id;
		this.emailAddress = emailAddress;
		this.password = password;
		this.workflowRefUserid = workflowRefUserid;
		this.isActive = isActive;
		this.isExpired = isExpired;
		this.isSuspended = isSuspended;
		this.isAuthorizationOnly = isAuthorizationOnly;
	}

	public UserAuth(String id, String emailAddress, String password,
			String workflowRefUserid, Boolean isActive, Boolean isExpired,
			Boolean isSuspended, Date createdDate, Date updatedDate,
			Boolean isAuthorizationOnly) {
		this.id = id;
		this.emailAddress = emailAddress;
		this.password = password;
		this.workflowRefUserid = workflowRefUserid;
		this.isActive = isActive;
		this.isExpired = isExpired;
		this.isSuspended = isSuspended;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.isAuthorizationOnly = isAuthorizationOnly;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

//	public UserRole getUserRole() {
//		return this.userRole;
//	}
//
//	public void setUserRole(UserRole userRole) {
//		this.userRole = userRole;
//	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWorkflowRefUserid() {
		return this.workflowRefUserid;
	}

	public void setWorkflowRefUserid(String workflowRefUserid) {
		this.workflowRefUserid = workflowRefUserid;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsExpired() {
		return this.isExpired;
	}

	public void setIsExpired(Boolean isExpired) {
		this.isExpired = isExpired;
	}

	public Boolean getIsSuspended() {
		return this.isSuspended;
	}

	public void setIsSuspended(Boolean isSuspended) {
		this.isSuspended = isSuspended;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Boolean getIsAuthorizationOnly() {
		return this.isAuthorizationOnly;
	}

	public void setIsAuthorizationOnly(Boolean isAuthorizationOnly) {
		this.isAuthorizationOnly = isAuthorizationOnly;
	}

}
