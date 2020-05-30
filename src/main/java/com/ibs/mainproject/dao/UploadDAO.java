package com.ibs.mainproject.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ibs.mainproject.model.UploadModel;
import com.ibs.mainproject.repository.StudentRepository;

@Component
public class UploadDAO {
	
	@Autowired
    StudentDAO studentDAO;
    @Autowired 
    StudentRepository studentRepository;
    

	@Transactional
	public  boolean save(List<UploadModel> listUploadModel){
		listUploadModel.stream().forEach(uploadModel->{
				try {
					studentDAO.save(uploadModel);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		});
			return true;
	}
}
