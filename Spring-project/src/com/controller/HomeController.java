package com.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.employeeDao;
import com.model.Emp;
import com.model.User;
import com.service.Mainservice;

@Controller
@ComponentScan("service")

public class HomeController {

	@Autowired
	Mainservice ser ;
	
	@Autowired
	employeeDao empDao;
	
	
	
	
	
	
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
	
	
}