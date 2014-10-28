package com.csi.ro.bizfoundation.service;

import java.util.Date;

public class FieldBean {

	private String field;
	private String type;
	private String comment;
	private Date i;
	
	
	public FieldBean(String field) {
		super();
		this.field = field;
	}
	public FieldBean(String field, String type, String comment) {
		super();
		this.field = field;
		this.type = type;
		this.comment = comment;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
