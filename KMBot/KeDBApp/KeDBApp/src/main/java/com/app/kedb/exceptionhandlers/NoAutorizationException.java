package com.app.kedb.exceptionhandlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.UNAUTHORIZED, reason="user is not autorized for signUp")
public class NoAutorizationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
