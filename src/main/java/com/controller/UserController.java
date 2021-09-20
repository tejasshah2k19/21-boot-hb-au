package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.UserEntity;
import com.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepo;

	@GetMapping("/signup")
	public String signup() {
		return "Signup";
	}

	@PostMapping("/signup")
	public String saveUser(UserEntity user) {
		
		userRepo.save(user);
		return "Home";
	}
	@GetMapping("/")
	public String home() {
		return "Home";
	}
}
