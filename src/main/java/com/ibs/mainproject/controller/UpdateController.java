package com.ibs.mainproject.controller;

import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibs.mainproject.entity.Student;
import com.ibs.mainproject.exception.ArgumentNullException;
import com.ibs.mainproject.model.UpdateModel;
import com.ibs.mainproject.service.BatchService;
import com.ibs.mainproject.service.UpdateService;


@RestController
@CrossOrigin(origins="http://localhost:4200") 
public class UpdateController {
	private static final Logger logger = LoggerFactory.getLogger(UpdateController.class);
	@Autowired
	UpdateService updateservice;
	
	@PutMapping("/update")
	public boolean saveUpdateData(@RequestBody UpdateModel updateModel)throws ArgumentNullException {
		try{
			if(Objects.isNull(updateModel))
				throw new ArgumentNullException("No values to update");
			else
				return updateservice.saveData(updateModel);
		}
		catch(ArgumentNullException e){
			logger.error("No values to update");
			throw new  ArgumentNullException("No values to update");
		}
	}
	
}

