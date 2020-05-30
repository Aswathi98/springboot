package com.ibs.mainproject.entity;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table( name = "student")
public class Student{
	
	@Id
	@Column( name = "amcat_id" )
	private long amcatId;
	
	@Column( name = "student_name" )
	private String studentName;
	
	@Column( name = "student_mobile")
	private long studentMobile;
	
	@Column( name = "student_email")
	private String studentEmail;
		
	@Column
	private String gender;
	
	@Column( name = "mark_10" )
	private float markTenth;
	
	@Column( name = "mark_12" )
	private float markTwelve;
	
	@Column( name = "student_address")
	private String studentAddress;
	
	@Column( name = "year_of_graduation" )
	private int yearOfGraduation;
	
	@Column ( name = "background_verification" )
	private String backgroundVerification;
	
	@Column ( name = "college_marks" )
	private float collegeMarks;
	
	@Column ( name = "created_time",   nullable = false, updatable = false)
	private Date createdTime;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column ( name = "modified_time")
    private Date modifiedTime;
	
	@Column ( name = "additional_contact_number" )
	private long additionalContactNumber;
	
	@Column ( name = "additional_email_id" )
	private String addtionalEmailId;
	
	@Column ( name = "student_remarks" )
	private String studentRemarks;
	
	@Column ( name = "student_additional_remarks" )
	private String studentAdditionalRemarks;
	
	@ManyToOne
	@JoinColumn ( name = "college_name" )
	private College college;
	
	@ManyToOne
	@JoinColumn ( name = "date_of_drive")
	private IbsDetails ibsDetails;
	
	@Column ( name = "student_branch")
	private String studentBranch;
	
	@Column ( name = "student_course" )
	private String studentCourse;
	
	@Column( name = "litmus_batch" )
	private String litmusBatch;
	
	@Column ( name = "college_percentage" )
	private float collegePercentage;

	public College getCollege() {
		return college;
	}
	
	public void setCollege(College college) {
		this.college = college;
	}
	public IbsDetails getIbsDetails() {
		return ibsDetails;
	}
	
	public void setIbsDetails(IbsDetails ibsDetails) {
		this.ibsDetails = ibsDetails;
	}
	public float getMarkTenth() {
		return markTenth;
	}
	
	public void setMarkTenth(float markTenth) {
		this.markTenth = markTenth;
	}
	
	public float getMarkTwelve() {
		return markTwelve;
	}
	
	public void setMarkTwelve(float markTwelve) {
		this.markTwelve = markTwelve;
	}
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public long getAmcatId() {
		return amcatId;
	}

	public void setAmcatId(long amcatId) {
		this.amcatId = amcatId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public int getYearOfGraduation() {
		return yearOfGraduation;
	}

	public void setYearOfGraduation(int yearOfGraduation) {
		this.yearOfGraduation = yearOfGraduation;
	}

	public String getBackgroundVerification() {
		return backgroundVerification;
	}

	public void setBackgroundVerification(String backgroundVerification) {
		this.backgroundVerification = backgroundVerification;
	}

	public float getCollegeMarks() {
		return collegeMarks;
	}

	public void setCollegeMarks(float collegeMarks) {
		this.collegeMarks = collegeMarks;
	}

	
	public long getAdditionalContactNumber() {
		return additionalContactNumber;
	}

	public void setAdditionalContactNumber(long additionalContactNumber) {
		this.additionalContactNumber = additionalContactNumber;
	}

	public String getAddtionalEmailId() {
		return addtionalEmailId;
	}

	public void setAddtionalEmailId(String addtionalEmailId) {
		this.addtionalEmailId = addtionalEmailId;
	}

	public String getStudentRemarks() {
		return studentRemarks;
	}

	public void setStudentRemarks(String studentRemarks) {
		this.studentRemarks = studentRemarks;
	}

	public String getStudentAdditionalRemarks() {
		return studentAdditionalRemarks;
	}

	public void setStudentAdditionalRemarks(String studentAdditionalRemarks) {
		this.studentAdditionalRemarks = studentAdditionalRemarks;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getLitmusBatch() {
		return litmusBatch;
	}

	public void setLitmusBatch(String litmusBatch) {
		this.litmusBatch = litmusBatch;
	}

	public float getCollegePercentage() {
		return collegePercentage;
	}

	public void setCollegePercentage(float collegePercentage) {
		this.collegePercentage = collegePercentage;
	}
	
public Student(){}
	
	public Student(long amcatId, String studentName, long studentMobile, String studentEmail,
			String gender, float markTenth, float markTwelve, String studentAddress, int yearOfGraduation,
			String backgroundVerification, float collegeMarks, Date createdTime, Date modifiedTime,
			long additionalContactNumber, String addtionalEmailId, String studentRemarks,
			String studentAdditionalRemarks, College college, IbsDetails ibsDetails, String studentBranch,
			String studentCourse, float collegePercentage,String litmusBatch) {
			super();
			this.amcatId = amcatId;
			this.studentName = studentName;
			this.studentMobile = studentMobile;
			this.studentEmail = studentEmail;
			this.gender = gender;
			this.markTenth = markTenth;
			this.markTwelve = markTwelve;
			this.studentAddress = studentAddress;
			this.yearOfGraduation = yearOfGraduation;
			this.backgroundVerification = backgroundVerification;
			this.collegeMarks = collegeMarks;
			this.createdTime = createdTime;
			this.modifiedTime = modifiedTime;
			this.additionalContactNumber = additionalContactNumber;
			this.addtionalEmailId = addtionalEmailId;
			this.studentRemarks = studentRemarks;
			this.studentAdditionalRemarks = studentAdditionalRemarks;
			this.college = college;
			this.ibsDetails = ibsDetails;
			this.studentBranch = studentBranch;
			this.studentCourse = studentCourse;
			this.litmusBatch=litmusBatch;
			this.collegePercentage = collegePercentage;
	}
}