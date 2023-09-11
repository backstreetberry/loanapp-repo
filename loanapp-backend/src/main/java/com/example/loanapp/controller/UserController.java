package com.example.loanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loanapp.model.User;
import com.example.loanapp.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/showMessage")
	public String showMessage() {
		return "Welcome!";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@RequestBody User u) {
		String result = "";
		
		User obj = userService.saveUser(u);
		
		if(obj != null) {
			result = "User data saved";
		}
		else {
			result = "Failed to insert data";
		}
		
		return result;
	}
}
