package com.au.models;

public class Employee {
	private Integer empId;
	private String employeeName;
	private String pos;

	public Employee() {

	}

	public Employee(Integer empId, String employeeName, String pos) {
		this.empId = empId;
		this.employeeName = employeeName;
		this.pos = pos;
	}

	public void display() {
		System.out.println(this.empId + " \t" + this.employeeName + "\t  " + this.pos);
	}
}
