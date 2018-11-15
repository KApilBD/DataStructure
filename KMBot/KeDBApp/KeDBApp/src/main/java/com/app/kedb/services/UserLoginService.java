package com.app.kedb.services;


import java.util.List;

import com.app.kedb.exceptionhandlers.InvalidPasswordException;
import com.app.kedb.exceptionhandlers.NoAutorizationException;
import com.app.kedb.exceptionhandlers.UserAlreadyExistsException;
import com.app.kedb.model.Menus;
import com.app.kedb.model.UserLogin;

public interface UserLoginService {

	List<Menus> validateUser(UserLogin userLogin) throws InvalidPasswordException;

	UserLogin createUser(UserLogin userLogin) throws NoAutorizationException, UserAlreadyExistsException;

	boolean createAuthUser(UserLogin userDetails);

}
