package com.loanapp.loanappbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.loanapp.loanappbackend.model.User;
import com.loanapp.loanappbackend.service.UserService;

public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/showMessage")
	public String showMessage() {
		return "Welcome";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@RequestBody User u) {
		String result =  userService.saveUser(u);
		return result;
	}

}
