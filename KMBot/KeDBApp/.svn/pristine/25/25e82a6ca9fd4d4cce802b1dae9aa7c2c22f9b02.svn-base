package com.app.kedb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.kedb.exceptionhandlers.NoAutorizationException;
import com.app.kedb.model.UserLogin;
import com.app.kedb.services.AdminService;

@RestController
@RequestMapping("/adminPage")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping("/saveUser")
	public HttpStatus createUser(@RequestBody UserLogin user) throws NoAutorizationException {
		// to save admin entered details
		return adminService.saveUser(user) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;

	}

}
