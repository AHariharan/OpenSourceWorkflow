package com.kanopus.workflow.workflowfacade.entities;

// default package
// Generated Aug 13, 2015 10:58:17 AM by Hibernate Tools 3.4.0.CR1

/**
 * WorkflowTaskBusinessFieldConfig generated by hbm2java
 */
public class WorkflowTaskBusinessFieldConfig implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5668143580592411975L;
	private Integer id;
	private String workflowProcessId;
	private String taskName;
	private String fieldName;
	private String fieldDatatype;
	private String fieldDefaultValue;

	public WorkflowTaskBusinessFieldConfig() {
	}

	public WorkflowTaskBusinessFieldConfig(String workflowProcessId,
			String taskName, String fieldName, String fieldDatatype,
			String fieldDefaultValue) {
		this.workflowProcessId = workflowProcessId;
		this.taskName = taskName;
		this.fieldName = fieldName;
		this.fieldDatatype = fieldDatatype;
		this.fieldDefaultValue = fieldDefaultValue;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWorkflowProcessId() {
		return this.workflowProcessId;
	}

	public void setWorkflowProcessId(String workflowProcessId) {
		this.workflowProcessId = workflowProcessId;
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldDatatype() {
		return this.fieldDatatype;
	}

	public void setFieldDatatype(String fieldDatatype) {
		this.fieldDatatype = fieldDatatype;
	}

	public String getFieldDefaultValue() {
		return this.fieldDefaultValue;
	}

	public void setFieldDefaultValue(String fieldDefaultValue) {
		this.fieldDefaultValue = fieldDefaultValue;
	}

}
