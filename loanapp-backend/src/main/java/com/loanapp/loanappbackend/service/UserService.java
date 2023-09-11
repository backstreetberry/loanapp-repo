package com.loanapp.loanappbackend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loanapp.loanappbackend.model.User;
import com.loanapp.loanappbackend.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public String saveUser(User u) {
		User obj = null;
		String result = "";
		Optional<User> opt = userRepo.findById(u.getId());
		
		if(opt.isPresent()) {
			result = "User is existing";
		}
		else {
			obj = userRepo.save(u);
			result = "User data saved";
		}
		
		return result;
	}
}
