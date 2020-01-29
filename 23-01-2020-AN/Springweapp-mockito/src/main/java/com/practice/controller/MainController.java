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
public class MainController {
	@RequestMapping("/home")
	public String add() {
		return "home";
	}
	
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	  public ModelAndView saveUser(Employee employee) throws ClassNotFoundException{
	     //add user handling logic here
		ModelAndView model = new ModelAndView("userDetails");
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		datasource datasource = context.getBean(datasource.class);
		
		//Get the EmployeeDAO Bean
		
		//Run some tests for JDBC CRUD operations
		
		//Create
		EmployeeDao employeeDAO=new EmployeeDao();
		employeeDAO.setDataSource(datasource);
		employeeDAO.save(employee);
	    
	    model.addObject("employee", employee);
	    return model;
	  }
	
//	@GetMapping("/view/{id}")
//	  public ModelAndView viewUser(@PathVariable String id) throws ClassNotFoundException{
//	     //add user handling logic here
//		ModelAndView model = new ModelAndView("view");
//		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
//		datasource datasource = context.getBean(datasource.class);
//		
//		//Get the EmployeeDAO Bean
//		
//		//Run some tests for JDBC CRUD operations
//		
//		//Create
//		EmployeeDao employeeDAO=new EmployeeDao();
//		employeeDAO.setDataSource(datasource);
//		Employee employee=employeeDAO.getById(Integer.parseInt(id));
//	    
//	    model.addObject("employee", employee);
//	    return model;
//	  }

	@RequestMapping("/viewall")
	  public ModelAndView viewAllUser() throws ClassNotFoundException{
	     //add user handling logic here
		ModelAndView model = new ModelAndView("viewall");
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		datasource datasource = context.getBean(datasource.class);
		

		EmployeeDao employeeDAO=new EmployeeDao();
		employeeDAO.setDataSource(datasource);
		 List<Employee>  employee=employeeDAO.getAll();
	    
	    model.addObject("employee", employee);
	    return model;
	  }

	}

