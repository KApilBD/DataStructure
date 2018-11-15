package com.app.kedb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.kedb.exceptionhandlers.InvalidPasswordException;
import com.app.kedb.exceptionhandlers.InvalidUserException;
import com.app.kedb.exceptionhandlers.NoAutorizationException;
import com.app.kedb.exceptionhandlers.UserAlreadyExistsException;
import com.app.kedb.model.AppMaster;
import com.app.kedb.model.Engagement;
import com.app.kedb.model.Menus;
import com.app.kedb.model.UserLogin;
import com.app.kedb.model.UserRole;
import com.app.kedb.repository.UserLoginDAO;
import com.app.kedb.repository.UserLoginRepository;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	private UserLoginRepository userRepository;

	@Autowired
	private UserLoginDAO userLoginDAO;

	@Override
	public List<Menus> validateUser(UserLogin inUser) throws InvalidPasswordException {
		boolean userFlag = false;
		UserLogin user = userLoginDAO.getAuthUser(inUser.getUsername());
		if (user != null && user.getUsername().equals(inUser.getUsername())) {
			userFlag = true;
			if (user.getPassword() == null) {
				throw new InvalidPasswordException();
			} else if (!user.getPassword().equals(inUser.getPassword())) {
				throw new InvalidPasswordException();
			}

		}
		if (userFlag) {
			List<UserRole> engId = userLoginDAO.getEngId(inUser.getUsername());
			List<AppMaster> menuList = null;
			List<Menus> menus = new ArrayList<Menus>();
			if (!engId.isEmpty()) {
				menuList = userLoginDAO.getMenuList(engId.get(0).getEngId());
				for (AppMaster app : menuList) {

					Menus menu = new Menus();
					menu.setTower(app.getTower());
					menu.setCcName(app.getCcName());
					menu.setCluster(app.getCluster());
					menus.add(menu);
				}
				ArrayList<String> al = new ArrayList<String>();
				for(UserRole role: engId) {
					String str = role.getEngId();
					al.add(str);
					
				}
				List<Engagement> engagemnts = userLoginDAO.getEngagments(inUser.getUsername());
				Menus menu = new Menus();
				menu.setEngagements(engagemnts);
				menus.add(menu);
			}
			
			
			
			return menus;
		} else
			throw new InvalidUserException();

	}

	@Override
	public UserLogin createUser(UserLogin userLogin) throws NoAutorizationException, UserAlreadyExistsException {
		// List<UserLogin> createUser = userRepository.findAll();

		UserLogin usr = userLoginDAO.getAuthUser(userLogin.getUsername());

		if (usr != null && usr.getUsername() != null && null != usr.getPassword()) {
			throw new UserAlreadyExistsException();
		}
		if (usr != null && usr.getUsername() != null) {
			return usr;

		} else {
			throw new NoAutorizationException();
		}

	}

	@Override
	public boolean createAuthUser(UserLogin authUserDetails) {
		return userRepository.save(authUserDetails) != null;

	}

}
