package com.app.kedb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_role", schema="ke_db")
public class UserRole implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "user_id")
	private String userId;
	@Id
	@Column(name = "eng_id")
	private String engId;
	@Column(name = "eng_user_satus")
	private String eng_usr_status;
	@Column(name = "start_dt")
	private Date startDate;
	@Column(name = "end_dt")
	private Date endDate;
	@Column(name = "role_id")
	private int roleId;
	@Column(name = "read_access")
	private String readAccess;
	@Column(name = "write_access")
	private String writeAccess;
	@Column(name="created_date")
	private Date createdDate;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEngId() {
		return engId;
	}

	public void setEngId(String engId) {
		this.engId = engId;
	}

	public String getEng_usr_status() {
		return eng_usr_status;
	}

	public void setEng_usr_status(String eng_usr_status) {
		this.eng_usr_status = eng_usr_status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getReadAccess() {
		return readAccess;
	}

	public void setReadAccess(String readAccess) {
		this.readAccess = readAccess;
	}

	public String getWriteAccess() {
		return writeAccess;
	}

	public void setWriteAccess(String writeAccess) {
		this.writeAccess = writeAccess;
	}

}
