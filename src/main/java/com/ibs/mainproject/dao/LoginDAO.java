package com.ibs.mainproject.dao;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibs.mainproject.entity.Employee;
import com.ibs.mainproject.exception.ResourceNotFoundException;
import com.ibs.mainproject.model.LoginCredential;
import com.ibs.mainproject.repository.EmployeeRepository;
@Component
public class LoginDAO {
	
	private static final Logger logger=LoggerFactory.getLogger(LoginDAO.class);
		
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee getUser(LoginCredential loginCredential) throws ResourceNotFoundException{
		Employee employee=employeeRepository.findOne(loginCredential.getEmpId());
		try{
			if(Objects.isNull(employee))
				throw new ResourceNotFoundException("no such employee");
			else
				return employee;
			
		}catch(ResourceNotFoundException e){
			logger.error("no such employee");
			throw new ResourceNotFoundException("no such employee");
			
		}
	}

}
