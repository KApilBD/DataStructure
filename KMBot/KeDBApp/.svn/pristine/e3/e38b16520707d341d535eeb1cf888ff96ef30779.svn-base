package com.app.kedb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.kedb.model.UserLogin;
import com.app.kedb.model.UserRole;

public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {
	@Query("select user FROM UserLogin as user "
			+ "WHERE user.username = :username")
	UserLogin getAuthUser(@Param(value = "username") String username);

	@Query("select usr FROM UserRole as usr WHERE usr.userId = "
			+ ":username ORDER BY usr.createdDate")
	List<UserRole> getEngId(@Param(value = "username") String username);

}