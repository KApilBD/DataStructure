package com.app.kedb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "engagement")
public class Engagement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "eng_id")
	private String engId;
	@Column(name = "eng_name")
	private String engName;
	@Column(name = "eng_status")
	private String engStatus;
	@Column(name = "golive_dt")
	private Date goliveDate;
	@Column(name = "end_date")
	private Date endDate;
	@Column(name = "LANG")
	private String lang;
	public String getEngId() {
		return engId;
	}
	public void setEngId(String engId) {
		this.engId = engId;
	}
	public String getEngName() {
		return engName;
	}
	public void setEngName(String engName) {
		this.engName = engName;
	}
	public String getEngStatus() {
		return engStatus;
	}
	public void setEngStatus(String engStatus) {
		this.engStatus = engStatus;
	}
	public Date getGoliveDate() {
		return goliveDate;
	}
	public void setGoliveDate(Date goliveDate) {
		this.goliveDate = goliveDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	

}
