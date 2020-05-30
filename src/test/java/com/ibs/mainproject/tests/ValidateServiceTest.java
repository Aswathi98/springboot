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
import com.ibs.mainproject.dao.ValidateDao;
import com.ibs.mainproject.entity.Student;
import com.ibs.mainproject.exception.ResourceNotFoundException;
import com.ibs.mainproject.service.ValidateService;

@RunWith(MockitoJUnitRunner.class)
public class ValidateServiceTest {
  
  @Mock
  ValidateDao validateDao;
  
  @InjectMocks
  ValidateService  validateService;
  
  @Test
  public void ValidateTest() throws ResourceNotFoundException{
  
    List<Student> studentList=new ArrayList<>();
    Mockito.when(validateDao.validate()).thenReturn(studentList);
    assertEquals(0,(validateService.validate()).size());   
  }
  
}