package com.ibs.mainproject.dao;

import java.text.ParseException;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ibs.mainproject.entity.Employee;
import com.ibs.mainproject.model.LoginModel;
import com.ibs.mainproject.repository.EmployeeRepository;

@Component

@Transactional
public class AccessDAO {

	@Autowired
	EmployeeRepository empRepo;

	public boolean regUser(LoginModel model) throws ParseException {

		System.out.println(model);
		Employee employee = new Employee();
		employee.setEmpId(model.getEmpId());
		employee.setPassword(model.getPassword());
		employee.setUserName(model.getEmployeeName());
		employee.setRoleType(model.getRoleType());
		if(Objects.equals(model.getRoleType(),"admin"))
		    employee.setRoleId(1);
		else if(Objects.equals(model.getRoleType(),"recruiter"))
		    employee.setRoleId(2);
		else
		    employee.setRoleId(3);
		employee.setCreatedTime(employee.currentDate());
		System.out.println(employee.toString());
		empRepo.save(employee);
    
		return true;
	}

}
