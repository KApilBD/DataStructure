package com.app.kedb.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.kedb.model.AppMaster;
import com.app.kedb.model.Engagement;
import com.app.kedb.model.UserLogin;
import com.app.kedb.model.UserRole;

@Transactional
@Repository
public class UserLoginDAOImpl implements UserLoginDAO {
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	private UserLoginRepository userLoginRepo;
	@Autowired
	private EngagmentRepo engagmentRepo;
	@Autowired
	private AppMasterRepo appMasterRepo;

	@Override
	public UserLogin getAuthUser(String username) {
		UserLogin userDtls = userLoginRepo.getAuthUser(username);
		return userDtls;

	}

	@Override
	public UserLogin getUserDetails(String username, String password) {
		return null;
	}

	@Override
	public List<UserRole> getEngId(String username) {
		// get engagement ids
		List<UserRole> engIds = userLoginRepo.getEngId(username);
		return engIds;
	}

	@Override
	public List<AppMaster> getMenuList(String endId) {
		// get menu list for the given engagement
		List<AppMaster> menus = appMasterRepo.getMenuList(endId);
		return menus;
	}

	@Override
	public List<Engagement> getEngagments(String userName) {
		// get the engagement names for the current user
		/*
		 * String hql = "SELECT eng.engName FROM Engagement " +
		 * "as eng WHERE eng.engId IN(SELECT usr.engId from UserRole usr WHERE usr.userId = ?)"
		 * ;
		 */
		// engagements = entityManager.createQuery(hql).setParameter(0,
		// userName).getResultList();
		
		List<Engagement> engagements = engagmentRepo.getEngagments(userName);
		return engagements;
	}

}
