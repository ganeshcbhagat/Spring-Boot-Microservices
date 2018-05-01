package com.example.application.spring.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.application.spring.dto.UserDto;
import com.example.application.spring.service.LoginService;

@Controller
public class RegisterNewUserController {

	@Autowired
	private LoginService service;

	@RequestMapping(value = "/newUser")
	public String showLoginPage(ModelMap model) {
		return "register";
	}

	@RequestMapping(value = "/registerNewUser")
	public String showWelcomePage(ModelMap model, UserDto userDto) {

		if("".equals(userDto.getName()) || "".equals(userDto.getPassword())) {
			model.put("errorMessage", "name/password is should not be blank");
			return "register";
		}
		
		service.registerNewUser(userDto);
		
		model.put("name", userDto.getName());
		model.put("password", userDto.getPassword());

		return "welcome";
	}

}
