package com.springau;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springau.config.AppConfig;
import com.springau.model.Point;
import com.springau.model.Triangle;

public class Shape {

	public static void main(String[] args)
{
//		Point point= new Point();
//		point.setX(10);
//		point.setY(20);
//		
//		point.draw();
		
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		Point t=context.getBean(Point.class);
		t.draw();
}
}
