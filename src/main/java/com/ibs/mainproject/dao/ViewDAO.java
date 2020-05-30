package com.ibs.mainproject.dao;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ibs.mainproject.exception.ResourceNotFoundException;
import com.ibs.mainproject.entity.Student;
import com.ibs.mainproject.repository.StudentRepository;

@Component
public class ViewDAO {
	private static final Logger logger = LoggerFactory.getLogger(ViewDAO.class);
	@Autowired
	StudentRepository studentRepo;

	public List<Student> viewData() throws ResourceNotFoundException {
		
        try{
        	List<Student> list=studentRepo.findAll();
        	if(list.size()==0){
        		throw new ResourceNotFoundException("No Details Found");
        	}
        	else 
        		return list;
        }
        catch(ResourceNotFoundException e){
			logger.error("No Details Found");
			throw new ResourceNotFoundException("No Details Found");
		}
		
	}

}