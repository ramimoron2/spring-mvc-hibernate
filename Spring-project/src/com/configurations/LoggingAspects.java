package com.configurations;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.model.Emp;

@Aspect
@Component
@EnableAspectJAutoProxy
//@ComponentScan("com.*")
public class LoggingAspects {

	@Before("execution(public String showdata2())")
	public void loggingAdvice()
	{
		System.out.println("logging advice gets printed");
	}
}
