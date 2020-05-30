package com.ibs.mainproject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibs.mainproject.exception.ArgumentNullException;
import com.ibs.mainproject.model.UpdateModel;
import com.ibs.mainproject.service.BatchService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BatchController {
	private static final Logger logger=LoggerFactory.getLogger(BatchController.class);
	@Autowired
	BatchService batchService;

	@PostMapping("/batch")
	public boolean saveBatch(@RequestBody List<UpdateModel> listUpdateModel)throws ArgumentNullException {
		try{
			if(listUpdateModel.size()==0){
				throw new ArgumentNullException();
			}
			else
				return batchService.saveBatch(listUpdateModel);
		}catch(ArgumentNullException e){
			logger.error("No values found");
			throw new ArgumentNullException();
		}
		
	}

}