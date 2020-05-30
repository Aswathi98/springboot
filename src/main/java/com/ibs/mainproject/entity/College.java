package com.ibs.mainproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.util.Date;

import javax.persistence.Column;




@Entity(name="college")
public class College {
		
		@Id	
		@Column(name="college_name")
		private String collegeName;
		
		public String getCollegeName() {
		      return collegeName;
		}
		
		public void setCollegeName(String collegeName) {
		      this.collegeName = collegeName;
		}
		@Column(name="college_address ")
		private String collegeAddress;
		
		public String getCollegeAddress() {
		      return collegeAddress;
		}
		
		public void setCollegeAddress(String collegeAddress) {
		      this.collegeAddress = collegeAddress;
		}
		@Column(name="name_of_placement_officer")
		private String nameOfPlacementOfficer;
		
		public String getNameOfPlacementOfficer() {
		      return nameOfPlacementOfficer;
		}
		
		public void setNameOfPlacementOfficer(String nameOfPlacementOfficer) {
		      this.nameOfPlacementOfficer = nameOfPlacementOfficer;
		}
		@Column(name="number_of_placement_officer ")
		private long numberOfPlacementOfficer;
		
		public long getNumberOfPlacementOfficer() {
		      return numberOfPlacementOfficer;
		}
		
		public void setNumberOfPlacementOfficer(long numberOfPlacementOfficer) {
		      this.numberOfPlacementOfficer = numberOfPlacementOfficer;
		}
		
		
		@Column(name="email_of_placement_officer")
		private String emailOfPlacementOfficer;
		
		public String getEmailOfPlacementOfficer() {
		      return emailOfPlacementOfficer;
		}
		
		public void setEmailOfPlacementOfficer(String emailOfPlacementOfficer) {
		      this.emailOfPlacementOfficer = emailOfPlacementOfficer;
		}
		
		@Column(name="created_time ",nullable = false,updatable = false)
		private Date createdTime;
		
		public Date getCreatedTime() {
			return createdTime;
		}

		public void setCreatedTime(Date createdTime) {
			this.createdTime = createdTime;
		}
		@Column(name="university ")
		private String university;
		
		public String getUniversity() {
		      return university;
		}
		
		public void setUniversity(String university) {
		      this.university = university;
		}
		@UpdateTimestamp
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name="modified_time")
		private Date modifiedTime;

		public Date getModifiedTime() {
			return modifiedTime;
		}

		public void setModifiedTime(Date modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public College(){}

		public College(String collegeName, String collegeAddress, String nameOfPlacementOfficer,
				long numberOfPlacementOfficer, String emailOfPlacementOfficer, Date createdTime, String university,
				Date modifiedTime) {
			super();
			this.collegeName = collegeName;
			this.collegeAddress = collegeAddress;
			this.nameOfPlacementOfficer = nameOfPlacementOfficer;
			this.numberOfPlacementOfficer = numberOfPlacementOfficer;
			this.emailOfPlacementOfficer = emailOfPlacementOfficer;
			this.createdTime = createdTime;
			this.university = university;
			this.modifiedTime = modifiedTime;
		}
}

