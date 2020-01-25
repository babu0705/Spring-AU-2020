package com.au.mapper;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.au.models.Employee;

public class EmployeeMapping {
	private Map<Integer, Employee> employee;

	public EmployeeMapping(Map<Integer, Employee> employee) {
		this.employee = employee;
	}

	public void printemployee() {
		for (Map.Entry<Integer, Employee> i : employee.entrySet()) {
			i.getValue().display();
		}
	}
}
