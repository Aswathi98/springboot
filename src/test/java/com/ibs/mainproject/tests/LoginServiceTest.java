package com.ibs.mainproject.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ibs.mainproject.dao.LoginDAO;
import com.ibs.mainproject.entity.Employee;
import com.ibs.mainproject.exception.ResourceNotFoundException;
import com.ibs.mainproject.model.LoginCredential;
import com.ibs.mainproject.service.LoginService;

@RunWith(MockitoJUnitRunner.class)
public class LoginServiceTest {
	
	@InjectMocks
	LoginService loginService;
	
	@Mock
    LoginDAO loginDao;
	
	 @Test
	 public void loginServiceTest() throws ResourceNotFoundException{
		 LoginCredential loginCredential=new LoginCredential();
		
		 Employee employee=new Employee();
		 employee.setPassword("1");
		 
		 loginCredential.setEmpId("A-9322");
		 loginCredential.setPassword("1"); 
		 
		 try {
			Mockito.when(loginDao.getUser(loginCredential)).thenReturn(employee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			assertNotNull(loginService.validateUser(loginCredential));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	 }
	
}
