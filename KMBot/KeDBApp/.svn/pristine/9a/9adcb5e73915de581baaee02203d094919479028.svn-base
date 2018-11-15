package com.app.kedb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.kedb.model.IncidentData;
import com.app.kedb.services.IncKoDetailsService;

@RestController
@RequestMapping(value = "/IncKoDtls")
public class IncKoDetailsController {

	@Autowired
	private IncKoDetailsService incKoDetailsService;

	@PostMapping(value = "/getIncKoDtls/{tower}/{ccName}")
	public List<IncidentData> getIncidentDetails(@PathVariable String tower, @PathVariable String ccName) {
	
		return incKoDetailsService.getIncidentDetails(tower,ccName);

	}

	@PostMapping(value = "/getIncKoDtls/{tower}/{ccName}/{cluster}")
	public List<IncidentData> getIncidentDetails(@PathVariable String tower, @PathVariable String ccName,
			@PathVariable String cluster) {
		
		return incKoDetailsService.getIncidentDetails(tower,ccName,cluster);

	}

}
