package com.aop.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.aop.models.Employee;

@Component
public class EmployeeManager {

	public Employee getEmployeeById(Integer employeeid) {
		System.out.println("Method getEmployeeById called");
		return new Employee();
	}
	
	public List<Employee> getAllEmployee() {
		System.out.println("Method getAllEmployee Called");
		List<Employee> all_employees=new ArrayList<Employee>();
		String pos[]= {"General Manager","Quality Analyst","Technical Delivery Manager","Senior Software Engineer"};
		String name[]= {"Babu","Kaviya","Rajashri","Chandan"};
		for(int i=0;i<pos.length;i++)
		{
			all_employees.add(new Employee(i,name[i],pos[i]));
		}
		
		for(int i=0;i<pos.length;i++)
		{
			System.out.println("Name: "+(all_employees.get(i)).getEmployeeName()+" \tPosition: " +(all_employees.get(i)).getPos());
		}
		
		return all_employees;
	}
	
	public void deleteEmployee(Integer employee) {
		System.out.println("Method deleteEmployee Called");
	}
	
	public void updateEmployee(Employee employee) {
		System.out.println("Method updateEmployee Called");
	}
	
	

}
