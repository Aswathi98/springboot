package com.ibs.mainproject.tests;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import com.ibs.mainproject.dao.ViewDAO;
import com.ibs.mainproject.entity.Student;
import com.ibs.mainproject.exception.ResourceNotFoundException;
import com.ibs.mainproject.service.ViewService;

@RunWith(MockitoJUnitRunner.class)
public class ViewTestService {
	  @InjectMocks
	    ViewService viewService;
	    
	    @Mock
	    ViewDAO viewDao;
	    @Test
	    public void viewTest() throws ResourceNotFoundException
	    {
	    	
	    	List<Student> listStudent = new ArrayList<Student>();
	    	
	    	try {
				Mockito.when(viewDao.viewData()).thenReturn(listStudent);
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	assertNotNull(viewService.viewData());
	    }
		
}
	