package com.kanopus.workflow.workflowfacade.entities;

// default package
// Generated Aug 13, 2015 10:58:17 AM by Hibernate Tools 3.4.0.CR1

/**
 * RolePrevilige generated by hbm2java
 */
public class RolePrevilige implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6894161156305053587L;
	private String roleCde;
	private RoleMaster roleMaster;
	private boolean canStartCase;
	private boolean canSendMessage;
	private boolean canClaimTask;
	private boolean canViewonlyTask;
	private boolean canSearchTask;
	private boolean canPurgeCase;
	private boolean canSuspendCase;
	private boolean canParticipateCase;
	private boolean canSeeReports;

	public RolePrevilige() {
	}

	public RolePrevilige(RoleMaster roleMaster, boolean canStartCase,
			boolean canSendMessage, boolean canClaimTask,
			boolean canViewonlyTask, boolean canSearchTask,
			boolean canPurgeCase, boolean canSuspendCase,
			boolean canParticipateCase, boolean canSeeReports) {
		this.roleMaster = roleMaster;
		this.canStartCase = canStartCase;
		this.canSendMessage = canSendMessage;
		this.canClaimTask = canClaimTask;
		this.canViewonlyTask = canViewonlyTask;
		this.canSearchTask = canSearchTask;
		this.canPurgeCase = canPurgeCase;
		this.canSuspendCase = canSuspendCase;
		this.canParticipateCase = canParticipateCase;
		this.canSeeReports = canSeeReports;
	}

	public String getRoleCde() {
		return this.roleCde;
	}

	public void setRoleCde(String roleCde) {
		this.roleCde = roleCde;
	}

	public RoleMaster getRoleMaster() {
		return this.roleMaster;
	}

	public void setRoleMaster(RoleMaster roleMaster) {
		this.roleMaster = roleMaster;
	}

	public boolean isCanStartCase() {
		return this.canStartCase;
	}

	public void setCanStartCase(boolean canStartCase) {
		this.canStartCase = canStartCase;
	}

	public boolean isCanSendMessage() {
		return this.canSendMessage;
	}

	public void setCanSendMessage(boolean canSendMessage) {
		this.canSendMessage = canSendMessage;
	}

	public boolean isCanClaimTask() {
		return this.canClaimTask;
	}

	public void setCanClaimTask(boolean canClaimTask) {
		this.canClaimTask = canClaimTask;
	}

	public boolean isCanViewonlyTask() {
		return this.canViewonlyTask;
	}

	public void setCanViewonlyTask(boolean canViewonlyTask) {
		this.canViewonlyTask = canViewonlyTask;
	}

	public boolean isCanSearchTask() {
		return this.canSearchTask;
	}

	public void setCanSearchTask(boolean canSearchTask) {
		this.canSearchTask = canSearchTask;
	}

	public boolean isCanPurgeCase() {
		return this.canPurgeCase;
	}

	public void setCanPurgeCase(boolean canPurgeCase) {
		this.canPurgeCase = canPurgeCase;
	}

	public boolean isCanSuspendCase() {
		return this.canSuspendCase;
	}

	public void setCanSuspendCase(boolean canSuspendCase) {
		this.canSuspendCase = canSuspendCase;
	}

	public boolean isCanParticipateCase() {
		return this.canParticipateCase;
	}

	public void setCanParticipateCase(boolean canParticipateCase) {
		this.canParticipateCase = canParticipateCase;
	}

	public boolean isCanSeeReports() {
		return this.canSeeReports;
	}

	public void setCanSeeReports(boolean canSeeReports) {
		this.canSeeReports = canSeeReports;
	}

}