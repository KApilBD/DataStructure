package com.app.kedb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.kedb.model.IncidentData;

public interface IncidentKoDetailsRepo extends JpaRepository<IncidentData, Long> {

	@Query("SELECT inc FROM IncidentData inc where "
			+ "inc.tower= :tower and inc.ccName= :ccName")
	List<IncidentData> findByTowerCC(@Param(value = "tower") String tower, @Param(value = "ccName") String ccName);

	@Query("SELECT inc FROM IncidentData inc where "
			+ "inc.tower= :tower and inc.ccName= :ccName and inc.cluster=:cluster")
	List<IncidentData> findByTowerCluster(@Param(value = "tower") String tower, @Param(value = "ccName") String ccName,
			@Param(value = "cluster") String cluster);

}
