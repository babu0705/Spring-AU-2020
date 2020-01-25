package com.aop.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeCrudAspect {
	long startTime;
	
	@Before("execution(* com.aop.services.EmployeeManager.getAllEmployee(..))")
	public void logBeforeV1(JoinPoint joinPoint) {
		System.out.println("EmployeeAspect.logBeforeV1() : "+joinPoint.getSignature().getName()+"\n");
		startTime=System.currentTimeMillis();
		
	}
	
	@After("execution(* com.aop.services.EmployeeManager.getAllEmployee(..))")
	public void logAfterV1(JoinPoint joinPoint) {
		System.out.println("\nEmployeeAspect.logAfterV1() : "+joinPoint.getSignature().getName());
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime) + " milliseconds to Execute the fetch all Employees");
	}
}
