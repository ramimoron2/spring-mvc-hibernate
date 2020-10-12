package com.configurations;

import java.util.Properties;

import javax.sql.DataSource;
import org.apache.commons.dbcp.*;
import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate5.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class Hibernateconfiguration {

	
	
	
	
	
	
	
	    @Bean
	    public DataSource dataSource() {
	    	DriverManagerDataSource basicdatasource= new DriverManagerDataSource();
	    	
	    	
	    	
	    	
	       basicdatasource.setDriverClassName("com.mysql.jdbc.Driver");
	       basicdatasource.setUrl("jdbc:mysql://localhost:3306/student?verifyServerCertificate=false&useSSL=false&requireSSL=false");
	       basicdatasource.setUsername("root");
	       basicdatasource.setPassword("gandusala");
	       return basicdatasource;
	    }
	    
	    
	    @Bean
	    public LocalSessionFactoryBean getSessionFactory() {
	    	
	    	Properties properties= new Properties();
	    	properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	    //	properties.put("hibernate.current_session_context_class", "thread");
	    	properties.put("hibernate.show_sql", "true");
	    	properties.put("hibernate.hbm2ddl.auto", "update");
	    	
	    	
	    	
	    	LocalSessionFactoryBean localSessionFactoryBean= new LocalSessionFactoryBean();
	    	localSessionFactoryBean.setDataSource(dataSource());
	    	localSessionFactoryBean.setHibernateProperties(properties);
	    	localSessionFactoryBean.setPackagesToScan("com.model");
	    	
	    	
	    	
	    	
	    	return localSessionFactoryBean;
	    	
	    }
	    
	    
	/*
	 * @Bean
	 * 
	 * @Autowired public SessionFactory getsessionFactory(LocalSessionFactoryBean
	 * localSessionFactoryBean) { return localSessionFactoryBean.getObject();
	 * 
	 * }
	 */
	    
	/*
	 * @Bean
	 * 
	 * @Autowired public HibernateTemplate getTemplate(SessionFactory factory) {
	 * HibernateTemplate template = new HibernateTemplate();
	 * template.setSessionFactory(factory); template.setCheckWriteOperations(false);
	 * return template; }
	 */
	
	
	@Bean

	@Autowired
	public HibernateTransactionManager getTransactionManager(LocalSessionFactoryBean localSessionfactory) {
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(localSessionfactory.getObject());
		return hibernateTransactionManager;
	}

}
