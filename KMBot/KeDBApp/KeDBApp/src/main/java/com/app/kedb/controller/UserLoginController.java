package com.app.kedb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.kedb.exceptionhandlers.InvalidPasswordException;
import com.app.kedb.exceptionhandlers.NoAutorizationException;
import com.app.kedb.exceptionhandlers.UserAlreadyExistsException;
import com.app.kedb.model.Menus;
import com.app.kedb.model.UserLogin;
import com.app.kedb.services.UserLoginService;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000")
public class UserLoginController {

	@Autowired
	private UserLoginService userLoginService;

	@PostMapping("/login")
  @CrossOrigin("/login")
	public List<Menus> validateLoggedInUser(@RequestBody UserLogin userDetails) 
			throws InvalidPasswordException {
		List<Menus> menuDtls = userLoginService.validateUser(userDetails);
		return menuDtls;

	}

	@PostMapping("/chkAuthUser")
	public UserLogin checkAutorizedUser(@RequestBody UserLogin userDetails)
			throws NoAutorizationException, UserAlreadyExistsException {
		// check if the user is autorized to signUp

		UserLogin createUser = null;
		createUser = userLoginService.createUser(userDetails);

		return createUser;

	}

	@PostMapping("/createAuthUser")
	public HttpStatus createUser(@RequestBody UserLogin userDetails) 
			throws NoAutorizationException {
		return userLoginService.createAuthUser(userDetails) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;

	}

}
