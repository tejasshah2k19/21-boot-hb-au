package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping(value = { "/", "/home" })
	public String home() {
		return "Home";
	}

	@GetMapping("/users")
	public String getAllUsers(Model model) {
		List<UserEntity> users = userRepo.findAll();
		model.addAttribute("users", users);

		return "Users";
	}

	@GetMapping("/users/{userId}")
	public String getAllUsers(@PathVariable("userId") int userId, Model model) {
		UserEntity user = userRepo.getById(userId);
		model.addAttribute("user", user);

		return "ViewUser";
	}
}
