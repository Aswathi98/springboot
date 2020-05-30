package com.ibs.mainproject.tests;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ibs.mainproject.dao.UpdateDAO;
import com.ibs.mainproject.model.UpdateModel;
import com.ibs.mainproject.service.BatchService;

@RunWith(MockitoJUnitRunner.class)
public class BatchServiceTest {

	@Mock
	UpdateDAO updateDao;
	
	@InjectMocks
	BatchService batchService;
	
	@Test
	public void batchTest(){
		
		List<UpdateModel> listUpdateModel=new ArrayList<UpdateModel>();
		UpdateModel updateModel=new UpdateModel();
		Mockito.when(updateDao.save(updateModel)).thenReturn(true);
		assertTrue(batchService.saveBatch(listUpdateModel));		
	}
	
	
}
