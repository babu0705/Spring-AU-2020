package Annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  
@Target({ElementType.TYPE,ElementType.METHOD}) 
public @interface AnnotationUsage {
	String   e_id() default "";
    String   e_name();
    int      age();
}
@AnnotationUsage(
	    e_id="1",
	    e_name="Jakob",
	    age=37
	)

class Hello{ 
	
	@AnnotationUsage(
		    e_id="310",
		    e_name="BABU",
		    age=21
		)
	public void display()
	{
		
	}
	

}
