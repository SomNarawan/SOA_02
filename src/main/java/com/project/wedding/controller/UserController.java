package com.project.wedding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.wedding.entity.User;
import com.project.wedding.repository.UserRepository;

@RestController
public class UserController {
	@Autowired 
	UserRepository userR;
	
	@GetMapping("/users")
	public List<User> getUserAll() {
		List<User> userList = userR.findAll();
		return userList;
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable(value = "id") Integer id) {
		User user = userR.findById(id);
		return user;
	}
	
	

	
}
