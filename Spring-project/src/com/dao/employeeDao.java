package com.dao;



import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Emp;
import com.model.Question1;


@Repository
@ComponentScan("configurations")
//@Transactional  // can be used here too to make trsaction class level
public class employeeDao {

	@Autowired
	LocalSessionFactoryBean sessionFactory;
	
	
	public String save()
	{
		Emp obj = new Emp();
		obj.setEMPNO(58);
		obj.setDEPTNO(20);
		obj.setENAME("muntai");
		obj.setCOMM(new Float(300));
		obj.setSAL(new Float(300));
		System.out.println("value of object is =" + obj.toString() );
		sessionFactory.getObject().getCurrentSession().save(obj);
		
		return "success";
		
	}
	
	
	@Transactional
	public List<Emp> getAll()
	{
		List<Emp> allemployees=  sessionFactory.getObject().getCurrentSession().createQuery("FROM Emp").list();
		return allemployees;
	}
	
	
	
	@Transactional
	public String insertData(Emp employee)
	{
		
		try
		{
		sessionFactory.getObject().getCurrentSession().save(employee);
		}catch(Exception e)
		{
			return "faliure";
		}
		
		return "success";
	}
	
	@Transactional
	public String addQuestions1(Question1 question)
	{
		
		
		sessionFactory.getObject().getCurrentSession().save(question);
		
		return "sucess";
	}
	
	
}
