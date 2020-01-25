package com.aop.models;

public class Employee {
	private Integer empId;
	private String employeeName;
	private String pos;
	public Employee()
	{}
	public Employee(Integer empId, String employeeName, String pos) {
		this.empId = empId;
		this.employeeName = employeeName;
		this.pos = pos;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	
}
