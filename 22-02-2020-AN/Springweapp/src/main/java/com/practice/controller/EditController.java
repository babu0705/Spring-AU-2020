package com.practice.controller;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.config.AppConfig;
import com.practice.models.Employee;
import com.practice.models.datasource;


import dao.EmployeeDao;
@Controller

public class EditController {
	@RequestMapping("/edit")
	public String EditPage() {
		return "edit";
	}
	@RequestMapping(value = "/fetch",method=RequestMethod.POST)
	  public ModelAndView saveUser(int id) throws ClassNotFoundException{
	     //add user handling logic here
		ModelAndView model = new ModelAndView("edit");
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		datasource datasource = context.getBean(datasource.class);
		
		//Get the EmployeeDAO Bean
		
		//Run some tests for JDBC CRUD operations
		
		//Create
		EmployeeDao employeeDAO=new EmployeeDao();
		employeeDAO.setDataSource(datasource);
		Employee employee=employeeDAO.getById(id);
	    
	    model.addObject("employee", employee);
	    return model;
	  }
	@RequestMapping(value = "/editdata",method=RequestMethod.POST)
	  public ModelAndView saveUser(Employee employee) throws ClassNotFoundException{
	     //add user handling logic here
		ModelAndView model = new ModelAndView("edit");
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		datasource datasource = context.getBean(datasource.class);
		
		//Get the EmployeeDAO Bean
		
		//Run some tests for JDBC CRUD operations
		
		//Create
		EmployeeDao employeeDAO=new EmployeeDao();
		employeeDAO.setDataSource(datasource);
		String result=employeeDAO.update(employee);
	    
	    model.addObject("result", result);
	    return model;
	  }
}
