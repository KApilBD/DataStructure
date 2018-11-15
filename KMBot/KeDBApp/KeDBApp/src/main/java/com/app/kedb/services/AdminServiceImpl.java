package com.app.kedb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.kedb.exceptionhandlers.NoAutorizationException;
import com.app.kedb.model.UserLogin;
import com.app.kedb.repository.UserLoginDAO;
import com.app.kedb.repository.UserLoginRepository;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private UserLoginRepository UserLoginRepository;
	
	@Autowired
	private UserLoginDAO userLoginDAO;

	@Override
	public boolean saveUser(UserLogin user) throws NoAutorizationException {
		// TODO Auto-generated method stub
		UserLogin usrdtls = userLoginDAO.getAuthUser(user.getUsername());
		if(usrdtls != null) {
			throw new NoAutorizationException();
		}else {
			return UserLoginRepository.save(user) != null;
		}
		
	}

}
