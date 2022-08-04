package com.princeCODEZ.departmentuserservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.princeCODEZ.departmentuserservice.entity.User;
import com.princeCODEZ.departmentuserservice.service.UserService;
import com.princeCODEZ.departmentuserservice.valueObjects.ResponseTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/user")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		log.info("saving user from User Controller ");
		return userService.saveUser(user);
	}
	
	@GetMapping("/user_dept/{id}")
	public ResponseTemplate getUserWithDept(@PathVariable("id") Long userId) {
		log.info("user with department from User Controller ");
		return userService.getUserWithDept(userId);
	}
	

}
