package com.cnvt.bckend.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cnvt.bckend.model.User;
import com.cnvt.bckend.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
//	execute whenever the app is built
	@PostConstruct
	public void initRolesAndUser() {
		userService.initRolesAndUser();
	}
	
	@PostMapping({"/registerNewUser"})
	public User registerNewUser(@RequestBody User user) {
		return userService.registerNewUser(user);
		
	}
	
	@GetMapping({"/forAdmin"})
	@PreAuthorize("hasRole('Admin')")
	public String forAdmin() {
		return "ACCESS ONLY FOR Partnership";
	}
	
	@GetMapping({"/forUser"})
//	@PreAuthorize("hasRole('user')")
	@PreAuthorize("hasAnyRole('Admin','user')")
	public String forUser() {
		return "ACCESS ONLY FOR Follow-up";
	}

}
