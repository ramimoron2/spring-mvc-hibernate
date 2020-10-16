package com.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.configurations.PropertyConfigurations;
import com.dao.employeeDao;
import com.model.Answer1;
import com.model.Emp;
import com.model.Question1;
import com.model.User;
import com.service.Mainservice;
//import com.service.ResourceReader;

@Controller
@ComponentScan("service")

public class HomeController {

	@Autowired
	Mainservice ser ;
	
	@Autowired
	employeeDao empDao;
	
	@Autowired
	PropertyConfigurations propertyConfigurations;
	
	/*
	 * @Autowired ResourceReader reader;
	 */
	
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	/*
	 * @RequestMapping(value = "/", method = RequestMethod.GET) public String
	 * home(Locale locale, Model model) {
	 * System.out.println("Home Page Requested, locale = " + locale); Date date =
	 * new Date(); DateFormat dateFormat =
	 * DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
	 * //ser.getStudent();
	 * 
	 * 
	 * String formattedDate = dateFormat.format(date);
	 * 
	 * model.addAttribute("serverTime", formattedDate);
	 * 
	 * return "home"; }
	 */
	 

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		
		
		//model.addAttribute("welcomeText",reader.DisplayText() );
		model.addAttribute("welcomeText","himanshu" );
		return "home";
	}
	
	
	@RequestMapping(value = "/showdata", method = RequestMethod.GET)
	public String showdata( Model model) {

		
		List<Emp> allEmployees=empDao.getAll();
		System.out.println("value="+ allEmployees.toString());
		model.addAttribute("allemployees", allEmployees);
		return "user";
	}
	
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getUserName());
		return "user";
	}
	
	
	

	@RequestMapping(value = "/insertEmployee", method = RequestMethod.POST)
	public String insertEmployee(@Validated Emp emp, Model model) {
		System.out.println("User Page Requested");
		System.out.println("employee=="+ emp.toString());
		empDao.insertData(emp);
		//model.addAttribute("userName", user.getUserName());
		return "home";
	}
	
	@RequestMapping(value = "/insertQuestion1", method = RequestMethod.GET)
	public String addQuestion()
	{
		
		Question1 question= new Question1();
		question.setId("10");
		question.setQuestion("yes man what up");
		Answer1 ans= new Answer1();
		ans.setId("10");
		ans.setAnswer("bal");
		ans.setAnswerBY("himu");
		question.setAnswer(ans);
		return empDao.addQuestions1(question);
	}
	
	
	
	@RequestMapping(value = "/displayProperty", method = RequestMethod.GET)
	public String displayProperty()
	{
		
		System.out.println("value=====" + propertyConfigurations.getName());
		
		return propertyConfigurations.getName();
		
	}
	
	
}