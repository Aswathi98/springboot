package com.ibs.mainproject.model;

import org.springframework.stereotype.Component;

@Component
public class LoginModel {
		String empId;
		String password;
		String roleType;
		int roleId;
    String status;
		String employeeName;
	
		public int getRoleId() {
      return roleId;
    }

    public void setRoleId(int roleId) {
      this.roleId = roleId;
    }
    
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleType() {
    return roleType;
  }

  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }

}
