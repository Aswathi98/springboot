package com.ibs.mainproject.dao;

import java.text.ParseException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibs.mainproject.entity.Template;
import com.ibs.mainproject.model.SendMailModel;
import com.ibs.mainproject.model.TemplateModel;
import com.ibs.mainproject.repository.TemplateRepository;
@Transactional
@Component
public class TemplateDAO {
	
		@Autowired
		TemplateRepository templateRepo;
		
		public String getTemplates(SendMailModel mailModel){
			Template template=new Template(); 
			template=templateRepo.findOne(mailModel.getTemplateType());
			return template.getTemplate();
		}

    public boolean saveTemplate(TemplateModel templateModel) throws ParseException {
      Template template=new Template(); 
      template.setTemplateType(templateModel.getTemplateType());
      template.setTemplate(templateModel.getTemplate());
      template.setCreatedTime(template.currentDate());
      templateRepo.save(template);
      return true;
    }
    
}