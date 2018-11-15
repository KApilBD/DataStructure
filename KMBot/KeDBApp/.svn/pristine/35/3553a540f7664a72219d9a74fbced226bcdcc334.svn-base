package com.app.kedb.repository;


import java.util.List;

import com.app.kedb.model.AppMaster;
import com.app.kedb.model.Engagement;
import com.app.kedb.model.UserLogin;
import com.app.kedb.model.UserRole;


public interface UserLoginDAO {
	//UserLogin getUserDetails(String username);

	UserLogin getAuthUser(String username);
	
	UserLogin getUserDetails(String username, String password);

	List<UserRole> getEngId(String username);
	
	List<AppMaster> getMenuList(String endId);
	
	List<Engagement> getEngagments(String endId);

}
