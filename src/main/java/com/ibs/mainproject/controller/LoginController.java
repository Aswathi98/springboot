package com.ibs.mainproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibs.mainproject.exception.ResourceNotFoundException;
import com.ibs.mainproject.model.LoginCredential;
import com.ibs.mainproject.model.LoginModel;
import com.ibs.mainproject.service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	LoginService loginService;

	@PostMapping("/login")
	public LoginModel validateUser(@RequestBody LoginCredential loginCredential) throws ResourceNotFoundException{
		return loginService.validateUser(loginCredential);
	}

}
