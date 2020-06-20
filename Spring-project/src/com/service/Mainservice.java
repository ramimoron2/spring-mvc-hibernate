package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.dao.employeeDao;
import com.model.Student;

@Component
@ComponentScan("model")
@ComponentScan("DAO")
public class Mainservice {

	@Autowired
	Student stu;
	
	@Autowired
	employeeDao empDao;
	
	
	public void getStudent()
	{
		stu.setName("himanshu");
		System.out.println("yesssss");
		
		empDao.save();
	}


	public Student getStu() {
		return stu;
	}

	@Autowired
	public void setStu(Student stu) {
		this.stu = stu;
	}
	
}
