/*
 * 	Subject: Spring MVC with Hikari 4.3 and Oracle 19 연동하기
 * 	Filename: HomeController.java
 * 	Create Date: 2020-09-23
 * 	Description: 
 * 	1. 
 * 	2
 * 
 */

package com.springMVC.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springMVC.web.dao.AddressBookDao;
import com.springMVC.web.persistance.DataSource;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	/*
	// Controller 안에서만 사용가능.
	@Value("#{props['dataSourceClassName']}")
	private String CLASSNAME;
	@Value("#{props['jdbcUrl']}")
	private String JDBC_URL;
	@Value("#{props['dataSource.user']}")
	private String USERNAME;
	@Value("#{props['dataSource.password']}")
	private String PASSWORD;
	
	*/
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	// @Value("#{props['jdbcUrl']}")
	// private String url;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		try {
			 //ds.getConnection();
			AddressBookDao dao = new AddressBookDao();
			
			dao.allSelect();
			
			//logger.info("URL:{}", JDBC_URL);
			//dao.allSelect();
			
		}
		catch(Exception e) {
			logger.info("msg: {}", e.getMessage());
		}
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
