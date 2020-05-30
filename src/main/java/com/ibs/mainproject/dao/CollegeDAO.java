package com.ibs.mainproject.dao;

import java.text.ParseException;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ibs.mainproject.entity.College;
import com.ibs.mainproject.model.UpdateModel;
import com.ibs.mainproject.model.UploadModel;
import com.ibs.mainproject.repository.CollegeRepository;

@Component
public class CollegeDAO {

      @Autowired
      CollegeRepository collegeRepository;
      
      

      @Transactional
      public College save(UploadModel uploadModel) throws ParseException{
 
          College college =new College();
          
	      college.setCollegeName(uploadModel.getCollegeName());
	      college.setCollegeAddress(uploadModel.getCollegeAddress());
	      college.setNameOfPlacementOfficer(uploadModel.getNameOfPlacementOfficer());
	      college.setNumberOfPlacementOfficer(uploadModel.getNumberOfPlacementOfficer());
	      college.setEmailOfPlacementOfficer(uploadModel.getEmailOfPlacementOfficer());
	      college.setUniversity(uploadModel.getUniversity());
	      college.setCreatedTime(uploadModel.currentDate());
	      return collegeRepository.save(college);
	      
      }
      
      @Transactional
      public College save(UpdateModel updateModel){
	       College college =new College();
	       college.setCollegeName(updateModel.getCollegeName());
	       college.setCollegeAddress(updateModel.getCollegeAddress());
	       college.setNameOfPlacementOfficer(updateModel.getNameOfPlacementOfficer());
	       college.setNumberOfPlacementOfficer(updateModel.getNumberOfPlacementOfficer());
	       college.setEmailOfPlacementOfficer(updateModel.getEmailOfPlacementOfficer());
	       college.setUniversity(updateModel.getUniversity());
	       return collegeRepository.save(college);
   }
}
