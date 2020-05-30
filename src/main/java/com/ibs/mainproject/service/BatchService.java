package com.ibs.mainproject.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.mainproject.dao.UpdateDAO;
import com.ibs.mainproject.model.UpdateModel;

@Service
public class BatchService {
	Logger logger = LoggerFactory.getLogger(BatchService.class);
	@Autowired
	UpdateDAO updateDAO;
	public boolean saveBatch(List<UpdateModel> listUpdateModel){
		logger.info(" BatchService saveBatch is invoked");
		listUpdateModel.stream().forEach(updateModel->{
			updateDAO.save(updateModel);
		});
		return true;
	}

}
