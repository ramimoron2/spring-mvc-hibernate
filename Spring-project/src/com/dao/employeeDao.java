package com.dao;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Emp;


@Repository
@ComponentScan("configurations")
@Transactional
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
	
	
}
