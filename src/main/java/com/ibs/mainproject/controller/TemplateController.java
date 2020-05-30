package com.ibs.mainproject.controller;

import java.text.ParseException;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibs.mainproject.dao.ViewDAO;
import com.ibs.mainproject.exception.ArgumentNullException;
import com.ibs.mainproject.model.TemplateModel;
import com.ibs.mainproject.service.TemplateService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TemplateController {
  private static final Logger logger = LoggerFactory.getLogger(ViewDAO.class);
  @Autowired
  TemplateService templateService;
  @PostMapping("/temp")
 public boolean saveTemplate(@RequestBody TemplateModel templateModel ) throws ParseException, ArgumentNullException{
    try{
          if(Objects.isNull(templateModel))
              throw new ArgumentNullException("No template found");
          else
              return templateService.saveTemplate(templateModel);
      }
      catch(ArgumentNullException e){
          logger.error("No template found");
          throw new ArgumentNullException("No template found");
    }
 }
}
