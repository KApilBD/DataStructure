package com.app.kedb.model;

import java.util.List;

public class Menus {

	private String ccName;

	private String tower;

	private String cluster;
	private List<Engagement> engagements;

	public List<Engagement> getEngagements() {
		return engagements;
	}

	public void setEngagements(List<Engagement> engagements) {
		this.engagements = engagements;
	}

	public String getCcName() {
		return ccName;
	}

	public void setCcName(String ccName) {
		this.ccName = ccName;
	}

	public String getTower() {
		return tower;
	}

	public void setTower(String tower) {
		this.tower = tower;
	}

	public String getCluster() {
		return cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
	}

}
