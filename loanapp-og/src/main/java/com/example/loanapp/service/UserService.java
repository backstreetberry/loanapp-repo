package com.example.loanapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loanapp.model.User;
import com.example.loanapp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	
	public User saveUser(User u) {
		
		User obj = null;
		obj = userRepo.findById(u.getId()).get();
		
		if(obj == null) {
			obj=userRepo.save(u);
		}
		return obj;
	}
}
