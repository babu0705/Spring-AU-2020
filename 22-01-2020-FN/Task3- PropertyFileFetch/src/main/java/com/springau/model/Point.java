package com.springau.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@PropertySource("classpath:application.properties")
@Component
public class Point {
 private int x;
 private int y;
 
 public Point(int x,int y) {
	 this.x=x;
	 this.y=y;
}
 public int getX() {
	return x;
}
 public int getY() {
	return y;
}
 
 public void setX(int x) {
	this.x = x;
}
 public void setY(int y) {
	this.y = y;
}
 
 public void draw() {
	 System.out.println("X :"+x+" Y :"+y);
 }
}
