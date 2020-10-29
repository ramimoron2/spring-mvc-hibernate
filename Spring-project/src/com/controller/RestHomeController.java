package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dao.employeeDao;
import com.model.Emp;

@Controller
@ComponentScan("service")
public class RestHomeController {

	@Autowired
	employeeDao empDao;
	
	@RequestMapping(value = "/getEmployeeData", method = RequestMethod.GET)
	public String showdata( Model model, HttpServletResponse response) {

		
		List<Emp> allEmployees=empDao.getAll();
		// response.setHeader("Content-Disposition", "attachment; filename=rates.json");
		    model.addAttribute("employees", allEmployees);
		System.out.println("value="+ allEmployees.toString());
		
		return "jsonView";
	}
	
	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public String showdata2( ) {

		
		List<Emp> allEmployees=empDao.getAll();
		// response.setHeader("Content-Disposition", "attachment; filename=rates.json");
		   // model.addAttribute("employees", "what is your name");
		System.out.println("value="+ allEmployees.toString());
		
		return "jsonView";
	}
	
	
}
