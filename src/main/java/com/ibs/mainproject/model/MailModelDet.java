package com.ibs.mainproject.model;

public class MailModelDet {

	private String studentName;
	private String studentEmail;
	private long amcatId;
	private long studentMobile;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
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

	public long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public MailModelDet() {
		super();
	}

	public MailModelDet(String studentName, String studentEmail, long amcatId, long studentMobile) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.amcatId = amcatId;
		this.studentMobile = studentMobile;
	}
	
	
}
