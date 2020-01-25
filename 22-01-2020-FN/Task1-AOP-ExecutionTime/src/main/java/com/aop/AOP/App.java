package com.aop.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.EmployeeManager;

/**
 * Hello world!
 *
 */
@ComponentScan(basePackages = "com.aop")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
     
        EmployeeManager manager = context.getBean(EmployeeManager.class);
        manager.getAllEmployee();
    }
}
