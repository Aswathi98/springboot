package com.ibs.mainproject.tests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ibs.mainproject.dao.UpdateDAO;
import com.ibs.mainproject.dao.UploadDAO;
import com.ibs.mainproject.model.UploadModel;
import com.ibs.mainproject.service.UpdateService;
import com.ibs.mainproject.service.UploadService;

@RunWith(MockitoJUnitRunner.class)
public class UploadTestService {
	@Mock
	UploadDAO uploadDao;
	@Mock
	UploadService uploadTestService;
	
@Test
public void uploadTest() throws ParseException {
	 List<UploadModel> listUploadModel= new ArrayList<UploadModel>();
	 Mockito.when(uploadDao.save(listUploadModel)).thenReturn(true);
	 assertNotNull(uploadTestService.saveData(listUploadModel));
}
}