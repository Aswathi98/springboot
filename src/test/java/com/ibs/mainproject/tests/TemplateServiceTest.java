package com.ibs.mainproject.tests;

import java.text.ParseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.*;
import com.ibs.mainproject.dao.TemplateDAO;
import com.ibs.mainproject.model.TemplateModel;
import com.ibs.mainproject.service.TemplateService;

@RunWith(MockitoJUnitRunner.class)
public class TemplateServiceTest {

  @InjectMocks
  TemplateService templateService;
  
  @Mock
    TemplateDAO templateDao;
  
  @Test
  public void templateServiceTest() throws ParseException{
    TemplateModel templateModel=new TemplateModel();
    
    Mockito.when( templateDao.saveTemplate(templateModel)).thenReturn(true);
    assertTrue(templateService.saveTemplate(templateModel));
  }
  
}
