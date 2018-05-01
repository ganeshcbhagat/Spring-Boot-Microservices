package com.example.application.spring.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionAttributeStore;
import org.springframework.web.bind.support.SessionStatus;

import com.example.application.spring.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginService service;

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		LOGGER.info("Dispathing Login page");
		return "login";
	}

	@RequestMapping(path= "/logout")
	public String showLogoutPage(SessionStatus sessionStatus) {
		LOGGER.info("Logout will perform and dispathing to Login page");
		sessionStatus.setComplete();
		return "login";
	}
	
	@RequestMapping(path = "/auth", method = RequestMethod.POST)
	public String authenticateUser(ModelMap model, @RequestParam String name, @RequestParam String password) {

		LOGGER.info("Doing authentication");
		
		boolean isValidUser = service.validateUser(name, password);

		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}

		model.put("name", name);
		model.put("password", password);
		
		LOGGER.info("Dispathing welcome page");
		
		return "welcome";
	}

}
