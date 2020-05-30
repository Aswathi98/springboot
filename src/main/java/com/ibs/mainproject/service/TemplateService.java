package com.ibs.mainproject.service;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.mainproject.dao.TemplateDAO;
import com.ibs.mainproject.model.TemplateModel;
@Service
public class TemplateService {
  @Autowired
  TemplateDAO templateDAO;
    public boolean saveTemplate(TemplateModel templateModel) throws ParseException{
          return templateDAO.saveTemplate(templateModel);
    }
}
