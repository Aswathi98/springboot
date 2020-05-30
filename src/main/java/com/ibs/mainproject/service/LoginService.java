package com.ibs.mainproject.service;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.mainproject.dao.LoginDAO;
import com.ibs.mainproject.entity.Employee;
import com.ibs.mainproject.exception.ResourceNotFoundException;
import com.ibs.mainproject.model.LoginCredential;
import com.ibs.mainproject.model.LoginModel;

@Service
public class LoginService {
	 private static final Logger logger = LoggerFactory.getLogger(LoginService.class);
	@Autowired
	LoginDAO loginDao;
	LoginModel loginModel = null;

	public LoginModel validateUser(LoginCredential loginCredential) throws ResourceNotFoundException{
		logger.info(" LoginService validateUser is invoked");
		loginModel = new LoginModel();
		loginModel.setStatus("Failure");
		Employee employee = loginDao.getUser(loginCredential);
		if (Objects.nonNull(employee)) {
			if (Objects.equals(loginCredential.getPassword(),employee.getPassword())) {
				

				loginModel.setStatus("Success");
				loginModel.setEmployeeName(employee.getUserName());
				loginModel.setRoleId(employee.getRoleId());
				loginModel.setEmpId(employee.getEmpId());

			}

		}
		return loginModel;

	}
}