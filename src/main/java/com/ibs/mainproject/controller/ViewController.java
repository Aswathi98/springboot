package com.ibs.mainproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ibs.mainproject.model.UpdateModel;
import com.ibs.mainproject.service.ViewService;
import com.ibs.mainproject.exception.ResourceNotFoundException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class ViewController {
	@Autowired
	ViewService viewService;

	@GetMapping("/list")
	public List<UpdateModel> showList()throws ResourceNotFoundException{
		return viewService.viewData();

	}

}