package com.ibs.mainproject.model;

public class MailModel {
	private String studentName;
	private String studentEmail;
	
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


	public MailModel() {
		super();
	}

	public MailModel(String studentName, String studentEmail) {
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}
	
}
