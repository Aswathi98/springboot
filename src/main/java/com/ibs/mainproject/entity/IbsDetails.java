package com.ibs.mainproject.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name="ibs_details")
public class IbsDetails {
  
  @Id
  @Column(name="date_of_drive")
  private Date dateOfDrive;
  
  public Date getDateOfDrive() {
    return dateOfDrive;
  }
  public void setDateOfDrive(Date dateOfDrive) {
    this.dateOfDrive = dateOfDrive;
  }

	@Column(name="venue_of_drive")
	private String venueOfDrive;
	public String getVenueOfDrive() {
		return venueOfDrive;
		
	}
	public void setVenueOfDrive(String venueOfDrive) {
		this.venueOfDrive = venueOfDrive;
	}
	@Column(name="pre_learning_link")
	private String preLearningLink;
	public String getPreLearningLink() {
		return preLearningLink;
	}
	public void setPreLearningLink(String preLearningLink) {
		this.preLearningLink = preLearningLink;
	}
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modified_time")
	private Date modifiedTime ;
	
	
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	@Column(name="created_time",   nullable = false, updatable = false)
	private Date createdTime;
	
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

		@Column(name="litmus_status")
	private String litmusStatus;
	public String getLitmusStatus() {
		return litmusStatus;
	}
	public void setLitmusStatus(String litmusStatus) {
		this.litmusStatus = litmusStatus;
	}
	
	public IbsDetails(){}
	public IbsDetails(Date dateOfDrive, String venueOfDrive, String preLearningLink, Date modifiedTime,
			Date createdTime, String litmusStatus) {
		super();
		this.dateOfDrive = dateOfDrive;
		this.venueOfDrive = venueOfDrive;
		this.preLearningLink = preLearningLink;
		this.modifiedTime = modifiedTime;
		this.createdTime = createdTime;
		this.litmusStatus = litmusStatus;
	}
	
}