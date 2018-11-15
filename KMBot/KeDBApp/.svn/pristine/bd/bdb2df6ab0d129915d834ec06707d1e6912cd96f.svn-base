package com.app.kedb.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.app.kedb.model.IncidentData;

@Repository
@Transactional
public class IncidentKoDetailsDaoImpl implements IncidentKoDetailsDao{

	@Autowired
	IncidentKoDetailsRepo incidentKoDetailsRepo;
	
	@Override
	public List<IncidentData> getIncidentDetails(String tower, String ccName) {
		List<IncidentData> incidents = incidentKoDetailsRepo.findByTowerCC(tower,ccName);
		
		return incidents;
		
	}

	@Override
	public List<IncidentData> getIncidentDetails(String tower, String ccName, String cluster) {
		List<IncidentData> incidents = incidentKoDetailsRepo.findByTowerCluster(tower,ccName, cluster);
		return incidents;
	}

}
