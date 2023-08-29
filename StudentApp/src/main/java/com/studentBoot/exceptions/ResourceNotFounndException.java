package com.studentBoot.exceptions;

public class ResourceNotFounndException extends RuntimeException{
	
	private String resourceName;
	private String fieldName;
	private int fieldValue;
	
	public ResourceNotFounndException(String resourceName, String fieldName, int fieldValue) {
		super(String.format("%s not found with %s : %d", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public int getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(int fieldValue) {
		this.fieldValue = fieldValue;
	}

	@Override
	public String toString() {
		return "ResourceNotFounndException [resourceName=" + resourceName + ", fieldName=" + fieldName + ", fieldValue="
				+ fieldValue + "]";
	}

	public ResourceNotFounndException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFounndException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFounndException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFounndException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFounndException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
