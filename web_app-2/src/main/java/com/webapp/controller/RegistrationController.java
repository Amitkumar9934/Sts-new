package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.entity.Registration;
import com.webapp.service.RegistrationService;



@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	
	
	 //http://localhost:8080/view-registration
	//Handler Methods
	@RequestMapping("/view-registration")
	public String viewsRegistrationPage() {
		return "registration";
	}
	
	@RequestMapping("/saveReg")
	public String saveReg(Registration registration) {
		registrationService.saveRegistration(registration);
		
		return "registration";
	}


}
