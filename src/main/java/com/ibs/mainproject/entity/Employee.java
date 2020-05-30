package com.ibs.mainproject.entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "users")
public class Employee {
	@Id
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "user_password")
	private String password;
	
	@Column(name = "role_id")
	private int roleId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "role_type")
	private String roleType;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column ( name = "modified_time")
	private Date modifiedTime;

	@Column ( name = "created_time",   nullable = false, updatable = false)
	private Date createdTime;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRoleType() {
    return roleType;
  }

  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }

  public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getEmpId() {
		return userId;
	}

	public void setEmpId(String empId) {
		this.userId = empId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date currentDate() throws ParseException{
    	DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    	Date dateobj = new Date();
    	String str=df.format(dateobj);
    	return(df.parse(str));
    }

  @Override
  public String toString() {
    return "Employee [userId=" + userId + ", password=" + password + ", roleId=" + roleId
        + ", userName=" + userName + ", roleType=" + roleType + ", modifiedTime=" + modifiedTime
        + ", createdTime=" + createdTime + "]";
  }

}