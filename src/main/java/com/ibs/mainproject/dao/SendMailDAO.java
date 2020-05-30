package com.ibs.mainproject.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ibs.mainproject.exception.ResourceNotFoundException;
import com.ibs.mainproject.model.MailModel;
import com.ibs.mainproject.model.MailModelDet;
import com.ibs.mainproject.repository.StudentRepository;
import com.ibs.mainproject.repository.TemplateRepository;

@Component
public class SendMailDAO {
	private static final Logger logger = LoggerFactory.getLogger(SendMailDAO.class);
	@Autowired
	StudentRepository studentRepo;
	@Autowired
	TemplateRepository templateRepo;
	
	public List<MailModel> fetchData(String litmusBatch){
		return studentRepo.getByBatchName(litmusBatch);
	}

	public List<String> getBatchNames() throws ResourceNotFoundException {
		
		List<String> listBatchNames=studentRepo.getBatchNames();
		try{
			if(listBatchNames.size()==0){
				throw new ResourceNotFoundException("No Batches Found");
			}
			else
				return listBatchNames;
		}
		catch(ResourceNotFoundException e){
			logger.error("No such entries");
			throw new ResourceNotFoundException("No Batches Found");
		}
	}

	public List<MailModelDet> getBatchDetails(String litmusBatch) throws ResourceNotFoundException{
		
		List<MailModelDet> listMailModel=studentRepo.getByBatchDetails(litmusBatch);
		try{
				if(listMailModel.size()==0){
					throw new ResourceNotFoundException("No Details for selected option");
				}
				else
					return listMailModel;
		}
		catch(ResourceNotFoundException e){
			logger.error("No such entries");
			throw new ResourceNotFoundException("No Details for selected option");
		}
	}
	
	public List<String> getTypeNames() throws ResourceNotFoundException{
		List<String> listTypeName=templateRepo.getByTypeNames();
		try{
			if(listTypeName.size()==0)
				throw new ResourceNotFoundException("No such type found");
				else
				return listTypeName;
				
	     }
		catch(ResourceNotFoundException e){
			logger.error("No such type found");
			throw new ResourceNotFoundException("No such type found");
		}
		
	}
}