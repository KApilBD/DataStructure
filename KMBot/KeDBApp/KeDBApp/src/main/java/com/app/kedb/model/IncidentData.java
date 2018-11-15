package com.app.kedb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "incident_data")
public class IncidentData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "Assigned_Group")
	private String assignedGroup;
	@Column(name = "Assignee")
	private String assignee;
	@Column(name = "Breach_Exception")
	private String breachException;
	@Column(name = "Breach_Reason")
	private String breachReason;
	@Column(name = "Estimated_Resolution_Date")
	private Date estimatedResolutionDate;
	@Column(name = "Impact")
	private String Impact;
	@Id
	@Column(name = "inc_id")
	private String inc_id;
	@Column(name = "STATUS")
	private String STATUS;
	@Column(name = "priority")
	private String priority;
	@Column(name = "summary")
	private String summary;
	@Column(name = "Notes")
	private String notes;
	@Column(name = "Last_Modified_by")
	private String Last_Modified_by;
	@Column(name = "Last_Modified_Date")
	private Date lastModifiedDate;
	@Column(name = "Resolved_Date")
	private Date resolvedDate;
	@Column(name = "Operational_Categorization_Tier_1")
	private String Operational_Categorization_Tier_1;
	@Column(name = "Operational_Categorization_Tier_2")
	private String Operational_Categorization_Tier_2;
	@Column(name = "Reported_Date")
	private Date reportedDate;
	@Column(name = "service_type")
	private String serviceType;
	@Column(name = "Urgency")
	private String urgency;
	@Column(name = "incAgeing")
	private String Inc_Ageing;
	@Column(name = "Status_Reason")
	private String statusReason;
	@Column(name = "relev_perc")
	private String relevPerc;
	@Column(name = "usage_perc")
	private String usagePerc;
	@Column(name = "Tower")
	private String tower;
	@Column(name = "CC")
	private String ccName;
	@Column(name = "Cluster")
	private String cluster;
	@Column(name = "date_created")
	private Date dateCreated;
	@Column(name = "date_updated")
	private Date dateUpdated;
	public String getAssignedGroup() {
		return assignedGroup;
	}
	public void setAssignedGroup(String assignedGroup) {
		this.assignedGroup = assignedGroup;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getBreachException() {
		return breachException;
	}
	public void setBreachException(String breachException) {
		this.breachException = breachException;
	}
	public String getBreachReason() {
		return breachReason;
	}
	public void setBreachReason(String breachReason) {
		this.breachReason = breachReason;
	}
	public Date getEstimatedResolutionDate() {
		return estimatedResolutionDate;
	}
	public void setEstimatedResolutionDate(Date estimatedResolutionDate) {
		this.estimatedResolutionDate = estimatedResolutionDate;
	}
	public String getImpact() {
		return Impact;
	}
	public void setImpact(String impact) {
		Impact = impact;
	}
	public String getInc_id() {
		return inc_id;
	}
	public void setInc_id(String inc_id) {
		this.inc_id = inc_id;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getLast_Modified_by() {
		return Last_Modified_by;
	}
	public void setLast_Modified_by(String last_Modified_by) {
		Last_Modified_by = last_Modified_by;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public Date getResolvedDate() {
		return resolvedDate;
	}
	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}
	public String getOperational_Categorization_Tier_1() {
		return Operational_Categorization_Tier_1;
	}
	public void setOperational_Categorization_Tier_1(String operational_Categorization_Tier_1) {
		Operational_Categorization_Tier_1 = operational_Categorization_Tier_1;
	}
	public String getOperational_Categorization_Tier_2() {
		return Operational_Categorization_Tier_2;
	}
	public void setOperational_Categorization_Tier_2(String operational_Categorization_Tier_2) {
		Operational_Categorization_Tier_2 = operational_Categorization_Tier_2;
	}
	public Date getReportedDate() {
		return reportedDate;
	}
	public void setReportedDate(Date reportedDate) {
		this.reportedDate = reportedDate;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getUrgency() {
		return urgency;
	}
	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}
	public String getInc_Ageing() {
		return Inc_Ageing;
	}
	public void setInc_Ageing(String inc_Ageing) {
		Inc_Ageing = inc_Ageing;
	}
	public String getStatusReason() {
		return statusReason;
	}
	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}
	public String getRelevPerc() {
		return relevPerc;
	}
	public void setRelevPerc(String relevPerc) {
		this.relevPerc = relevPerc;
	}
	public String getUsagePerc() {
		return usagePerc;
	}
	public void setUsagePerc(String usagePerc) {
		this.usagePerc = usagePerc;
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
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	
	

}
