package com.ibs.mainproject.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.*;
import com.ibs.mainproject.dao.SendMailDAO;
import com.ibs.mainproject.dao.TemplateDAO;
import com.ibs.mainproject.entity.Template;
import com.ibs.mainproject.exception.ResourceNotFoundException;
import com.ibs.mainproject.model.MailModel;
import com.ibs.mainproject.model.MailModelDet;
import com.ibs.mainproject.model.SendMailModel;
import com.ibs.mainproject.repository.StudentRepository;
import com.ibs.mainproject.service.MailService;


@RunWith(MockitoJUnitRunner.class)
public class MailServiceTest {

	@Mock
	SendMailDAO sendMail;
	
	@Mock
	TemplateDAO templateDao;
	
	@InjectMocks
	MailService mailService;
	
	@Mock
	StudentRepository studentRepo;
	
	@Test
	public void sendMailTest() throws ResourceNotFoundException{
		
		String message="mail sent successfully";
		SendMailModel sendModel=new SendMailModel();
		List<MailModel> listMailModel=new ArrayList<MailModel>();
		Template template=new Template();
		template.setTemplate("hi");
		MailModel mailModel=new MailModel();
		mailModel.setStudentName("eva");
		
		Mockito.when(sendMail.fetchData(sendModel.getLitmusBatch())).thenReturn(listMailModel);
		Mockito.when(templateDao.getTemplates(sendModel)).thenReturn(template.getTemplate());
		
		try {
			assertEquals(message,mailService.sendMail(sendModel) );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void getBatchNamesTest() throws ResourceNotFoundException{
		
	
		List<String> batchNames=new ArrayList<>();
		Mockito.when(sendMail.getBatchNames()).thenReturn(batchNames);
		
		assertNotNull(mailService.getBatchNames());
		
	}
	
	@Test
	public void getBatchDetailsTest() throws ResourceNotFoundException{
		String litmusBatch="lit_oct_19";
		List<MailModelDet>mailModelDet=new ArrayList<MailModelDet>();
		
		Mockito.when(studentRepo.getByBatchDetails(litmusBatch)).thenReturn(mailModelDet);
		assertNotNull(mailService.getBatchDetails(litmusBatch));
	}
	
	@Test
	public void getByTypeNamesTest() throws ResourceNotFoundException{
		
		List<String> typeName=new ArrayList<>();
		
		Mockito.when(sendMail.getTypeNames()).thenReturn(typeName);
		
	
		assertNotNull(mailService.getTypeNames());
		
	}
	
}
