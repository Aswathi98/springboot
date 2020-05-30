package com.ibs.mainproject.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import java.text.ParseException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import com.ibs.mainproject.dao.AccessDAO;
import com.ibs.mainproject.model.LoginModel;
import com.ibs.mainproject.service.AccessService;


@RunWith(MockitoJUnitRunner.class)
public class AccessServiceTest {
	

	@InjectMocks
	AccessService accessService;
	
	@Mock
	private AccessDAO accessDao;
	
	 @Test
	 public void accessTest() throws ParseException{
		 
		 LoginModel loginModel=new LoginModel();
		 loginModel.setEmpId("A-9322");
		 loginModel.setEmployeeName("mithu");
		 loginModel.setPassword("1");
		 loginModel.setRoleId(3);
		 
		 when(accessDao.regUser(loginModel) ).thenReturn(true);
		 assertTrue(accessService.regUser(loginModel));
		 
	 }
}
