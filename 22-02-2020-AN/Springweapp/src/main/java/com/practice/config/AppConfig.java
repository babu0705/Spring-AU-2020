package com.practice.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.practice.models.datasource;


@Configuration
@PropertySource("classpath:application.properties")

@ComponentScan(basePackages="com.*")
public class AppConfig {
	
	@Autowired
    private Environment env;
    
	@Bean
	public datasource getPoint() {
		String sqlurl = env.getProperty("sqlurl");
		String usernamee = env.getProperty("usernamee");
		String password = "";
		System.out.println(sqlurl+"user  "+usernamee+"pass  "+password);
		return new datasource(sqlurl,usernamee,password);
	}

}
