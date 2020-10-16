package com.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:display.properties")
public class PropertyConfigurations {

	@Autowired
    Environment env;
	
	

	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = env.getProperty("name");
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("propertyname =" + env.getProperty("name"));
	}
	
}
