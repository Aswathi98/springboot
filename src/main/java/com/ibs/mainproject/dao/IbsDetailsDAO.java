package com.ibs.mainproject.dao;

import java.text.ParseException;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ibs.mainproject.entity.IbsDetails;
import com.ibs.mainproject.model.UpdateModel;
import com.ibs.mainproject.model.UploadModel;
import com.ibs.mainproject.repository.IbsDetailsRepository;

@Component
public class IbsDetailsDAO {
      @Autowired
    IbsDetailsRepository ibsDetailsRepository;
    
      IbsDetails ibsDetails;

      @Transactional
      public IbsDetails save(UploadModel uploadModel) throws ParseException{
            
	        IbsDetails ibsDetails=new IbsDetails();
	        
	        ibsDetails.setDateOfDrive(uploadModel.getDateOfDrive());
	        ibsDetails. setVenueOfDrive(uploadModel.getVenueOfDrive());
	        ibsDetails.setPreLearningLink(uploadModel.getPreLearningLink());
	        ibsDetails.setLitmusStatus(uploadModel.getLitmusStatus());
	        ibsDetails.setCreatedTime(uploadModel.currentDate());
	        return ibsDetailsRepository.save(ibsDetails);
         
      }
      @Transactional
      public IbsDetails  save(UpdateModel updateModel){
    	  	IbsDetails ibsDetails=new IbsDetails();
            ibsDetails.setDateOfDrive(updateModel.getDateOfDrive());
	        ibsDetails. setVenueOfDrive(updateModel.getVenueOfDrive());
	        ibsDetails.setPreLearningLink(updateModel.getPreLearningLink());
	        ibsDetails.setLitmusStatus(updateModel.getLitmusStatus());
	        return ibsDetailsRepository.save(ibsDetails);
      }
      
}
