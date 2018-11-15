package com.app.kedb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.kedb.model.AppMaster;

public interface AppMasterRepo extends JpaRepository<AppMaster, Long>{
	@Query("select app FROM AppMaster as app WHERE app.engId = :engId")
	List<AppMaster> getMenuList(@Param(value="engId") String engId);
}