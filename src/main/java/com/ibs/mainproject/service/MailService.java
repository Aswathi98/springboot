package com.ibs.mainproject.service;

import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.mainproject.dao.SendMailDAO;
import com.ibs.mainproject.dao.TemplateDAO;
import com.ibs.mainproject.exception.ResourceNotFoundException;
import com.ibs.mainproject.model.MailModel;
import com.ibs.mainproject.model.MailModelDet;
import com.ibs.mainproject.model.SendMailModel;
@Service
public class MailService {
	Logger logger = LoggerFactory.getLogger(MailService.class);
	@Autowired
	SendMailService sendMailService;
	@Autowired
	TemplateDAO templateDAO;
	@Autowired
	SendMailDAO sendMailDAO;

	public SendMailModel sendMail(SendMailModel sendModel) throws ResourceNotFoundException{
		logger.info(" MailService sendMail is invoked");
		List<MailModel> listMailModel=sendMailDAO.fetchData(sendModel.getLitmusBatch());
		String template=templateDAO.getTemplates(sendModel);
		try{
			if((listMailModel.size()==0)||(Objects.isNull(template))){
				throw new ResourceNotFoundException("No such entries");
			}
			else {
				listMailModel.stream().forEach(mailModel->{
					String empName = mailModel.getStudentName();
					String title = "<b>Hi " + empName + "</b><br><br><br>"+template;
					sendMailService.sendMail("from@test.com", "G1-G6@test.com", "Welcome To IBS",
							title);
					sendModel.setStatus("mail sent succesfully");
				});
				return sendModel;
			}
		}catch (ResourceNotFoundException e){
			logger.error("No such entries");
			throw new ResourceNotFoundException("No such entries");
		}
		
	}

	public List<String> getBatchNames() throws ResourceNotFoundException {
		logger.info(" MailService getBatchNames is invoked");
		return sendMailDAO.getBatchNames();
	}

	public List<MailModelDet> getBatchDetails(String litmusBatch) throws ResourceNotFoundException{
		logger.info(" MailService getBatchDetails is invoked");
		return sendMailDAO.getBatchDetails(litmusBatch);
	}

	public List<String> getTypeNames() throws ResourceNotFoundException{
		logger.info(" MailService getTypeNames is invoked");
		return sendMailDAO.getTypeNames() ;
	}

}