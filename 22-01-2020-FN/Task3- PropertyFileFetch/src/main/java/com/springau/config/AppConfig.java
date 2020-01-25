package com.springau.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.springau.model.Point;
import com.springau.model.Triangle;
@Configuration

@ComponentScan(basePackages="com.*")
public class AppConfig {
	
	@Autowired
    private Environment env;
    
	@Bean(name="point")
	public Point getPoint() {
		int x = Integer.parseInt(env.getProperty("X"));
		int y = Integer.parseInt(env.getProperty("Y"));
		
		return new Point(x,y);
	}

}
