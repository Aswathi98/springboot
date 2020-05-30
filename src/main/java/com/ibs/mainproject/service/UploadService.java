package com.ibs.mainproject.service;

import java.text.ParseException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.mainproject.dao.UploadDAO;
import com.ibs.mainproject.model.UploadModel;


@Service
public class UploadService {
	
	Logger logger = LoggerFactory.getLogger(UploadService.class);
	
	@Autowired
	UploadDAO uploadDAO;
	
	public boolean saveData( List<UploadModel> listUploadModel) throws ParseException{
		logger.info(" UploadService saveData is invoked");
		return uploadDAO.save(listUploadModel);
	}
	
}