package com.app.kedb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.kedb.model.Engagement;

public interface EngagmentRepo extends JpaRepository<Engagement, Long>{
	
	@Query("SELECT eng.engName FROM Engagement as eng WHERE "
			+ "eng.engId IN(SELECT usr.engId from UserRole usr WHERE usr.userId =:userId)")
	List<Engagement> getEngagments(@Param(value="userId") String userId);

}