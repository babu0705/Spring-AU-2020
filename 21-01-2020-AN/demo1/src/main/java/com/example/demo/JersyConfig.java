package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JersyConfig extends ResourceConfig
{
	public JersyConfig()
	{
		register(Employees.class);
	}
}
