package com.ibs.mainproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibs.mainproject.exception.ResourceNotFoundException;
import com.ibs.mainproject.model.AmcatModel;
import com.ibs.mainproject.service.ValidateService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ValidateController {
  @Autowired
  ValidateService validateservice;
  @GetMapping("/amcatid")
  public List<AmcatModel> show() throws ResourceNotFoundException{
    return validateservice.validate();
    
  }

}
