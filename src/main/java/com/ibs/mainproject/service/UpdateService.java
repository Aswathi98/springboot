package com.ibs.mainproject.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.mainproject.dao.UpdateDAO;
import com.ibs.mainproject.model.UpdateModel;
@Service
public class UpdateService {
	Logger logger = LoggerFactory.getLogger(UpdateService.class);
			@Autowired
			UpdateDAO updateDAO;
			
			public boolean  saveData(UpdateModel updateModel){
				logger.info(" UpdateService saveData is invoked");
				return updateDAO.save(updateModel);
			}

		} 



