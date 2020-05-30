package com.ibs.mainproject.tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ibs.mainproject.dao.UpdateDAO;
import com.ibs.mainproject.model.UpdateModel;
import com.ibs.mainproject.service.UpdateService;

@RunWith(MockitoJUnitRunner.class)
public class UpdateTestService {
	@Mock
	UpdateDAO updateDao;
	@Mock
	UpdateService updateTestService;
	
@Test
public void updateTest()
{
	UpdateModel model = new UpdateModel();
	 Mockito.when(updateDao.save(model)).thenReturn(true);
		assertNotNull(updateTestService.saveData(model));

	}
}
