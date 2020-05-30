package com.ibs.mainproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.mainproject.dao.ValidateDao;
import com.ibs.mainproject.entity.Student;
import com.ibs.mainproject.exception.ResourceNotFoundException;
import com.ibs.mainproject.model.AmcatModel;


@Service
public class ValidateService {
  
  @Autowired
  ValidateDao validatedao;
  public List<AmcatModel> validate() throws ResourceNotFoundException{
    List<AmcatModel> amcatmodel = new ArrayList<>();
    List<Student> listStudent = validatedao.validate();
    listStudent.stream().forEach(std->{
      AmcatModel model =new AmcatModel();
      model.setAmcatId(std.getAmcatId());
      amcatmodel.add(model);
    
  });
    return amcatmodel;

}
}