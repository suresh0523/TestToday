package com.hcl.Employee.Dto;

public class EmployeeDto {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private String employeeCity;
	private long employeeMobile;
	private String employeeGender;
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeeCity() {
		return employeeCity;
	}
	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}
	public long getEmployeeMobile() {
		return employeeMobile;
	}
	public void setEmployeeMobile(long employeeMobile) {
		this.employeeMobile = employeeMobile;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeDto [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", employeeCity=" + employeeCity + ", employeeMobile=" + employeeMobile
				+ ", employeeGender=" + employeeGender + "]";
	}
	

}
