package Annotations;

import java.lang.reflect.Method;

public class EmployeeAnnotation {
	  
	public static void main(String args[])throws Exception{  
		
		AnnotationUsage annotation = Hello.class.getAnnotation(AnnotationUsage.class);
		
		Hello h1=new Hello();
		Method m1=h1.getClass().getMethod("display");
		AnnotationUsage methodannotation = m1.getAnnotation(AnnotationUsage.class);
		System.out.println("Class Annotations");
	    System.out.println("name: " + annotation.e_name());
	    System.out.println("id: " + annotation.e_id());
	    System.out.println("\n\nMethod Annotations");
	    System.out.println("employee name: " + methodannotation.e_name());
	    System.out.println("employee id: " + methodannotation.e_id());
	    
		
	}
}
