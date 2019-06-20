package com.hcl.Employee.Exception;

public class ApplicationException extends RuntimeException{

	private String errorMsg;
	
	public ApplicationException(String errorMsg,Throwable errorMessage) {
		super(errorMsg);
		this.setErrorMsg(errorMsg);
	}
	
	public ApplicationException(String errorMsg) {
		super(errorMsg);
		this.setErrorMsg(errorMsg);
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	


	
}
