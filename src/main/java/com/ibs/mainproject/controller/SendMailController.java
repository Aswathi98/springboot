package com.ibs.mainproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ibs.mainproject.exception.ResourceNotFoundException;
import com.ibs.mainproject.model.MailModelDet;
import com.ibs.mainproject.model.SendMailModel;
import com.ibs.mainproject.service.MailService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SendMailController {

	@Autowired
	MailService mailService;

	@PostMapping("/send")
	public SendMailModel sendMail(@RequestBody SendMailModel sendModel)throws ResourceNotFoundException{
		return mailService.sendMail(sendModel);
	}
	
	@GetMapping("/batchname")
	public List<String> getBatchName()throws ResourceNotFoundException{
		return mailService.getBatchNames();

	}
	
	@PostMapping("/batchdet")
	public List<MailModelDet> getBatchDetails (@RequestBody String litmusBatch) throws ResourceNotFoundException{
				return mailService.getBatchDetails(litmusBatch);		
	}
	
	@GetMapping("/type")
	public List<String> getByTypeName() throws ResourceNotFoundException{
		return mailService.getTypeNames();
	}
	
}