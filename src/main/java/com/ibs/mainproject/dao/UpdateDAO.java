package com.ibs.mainproject.dao;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ibs.mainproject.entity.College;
import com.ibs.mainproject.entity.IbsDetails;
import com.ibs.mainproject.entity.Student;
import com.ibs.mainproject.model.UpdateModel;
import com.ibs.mainproject.repository.StudentRepository;

@Component
public class UpdateDAO {

	    @Autowired
	    StudentDAO studentDAO;
	   
    @Transactional
    public boolean save(UpdateModel updateModel){
    	
    	studentDAO.save(updateModel);
  	  	return true;
	        
    }
    
 }