package com.app.kedb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.kedb.model.IncidentData;
import com.app.kedb.repository.IncidentKoDetailsDao;
@Service
public class IncKoDetailsServiceImpl implements IncKoDetailsService{

	@Autowired
	private IncidentKoDetailsDao incidentKoDetailsDao; 
	
	@Override
	public List<IncidentData> getIncidentDetails(String tower, String ccName) {
		
			return incidentKoDetailsDao.getIncidentDetails(tower,ccName);
		}
	
	@Override
	public List<IncidentData> getIncidentDetails(String tower, String ccName,String cluster) {
		
			return incidentKoDetailsDao.getIncidentDetails(tower,ccName,cluster);
		}
	}


