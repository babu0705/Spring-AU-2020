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

public class DeleteController {
	@RequestMapping("/delete")
	public String DeletePage() {
		return "delete";
	}
	@RequestMapping(value = "/deletedata",method=RequestMethod.POST)
	  public ModelAndView saveUser(int id) throws ClassNotFoundException{
	     //add user handling logic here
		ModelAndView model = new ModelAndView("delete");
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		datasource datasource = context.getBean(datasource.class);
		
		//Get the EmployeeDAO Bean
		
		//Run some tests for JDBC CRUD operations
		
		//Create
		EmployeeDao employeeDAO=new EmployeeDao();
		employeeDAO.setDataSource(datasource);
		String result=employeeDAO.deleteById(id);
	    
	    model.addObject("result", result);
	    return model;
	  }
	
}
