package com.ibs.mainproject.service;

import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.mainproject.dao.AccessDAO;
import com.ibs.mainproject.model.LoginModel;

@Service
public class AccessService {
	Logger logger = LoggerFactory.getLogger(AccessService.class);
	@Autowired
	AccessDAO accessDAO;

	public boolean regUser(LoginModel model) throws ParseException {
		logger.info(" AccessService regUser is invoked");
		return accessDAO.regUser(model);
	}

}
