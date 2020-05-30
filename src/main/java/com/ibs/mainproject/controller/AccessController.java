package com.ibs.mainproject.controller;

import java.text.ParseException;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ibs.mainproject.exception.AccessDeniedException;
import com.ibs.mainproject.model.LoginModel;
import com.ibs.mainproject.service.AccessService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AccessController {
	private static final Logger logger = LoggerFactory.getLogger(AccessController.class);

	@Autowired
	AccessService accessService;

	@PostMapping("/access")
	public Boolean regUser(@RequestBody LoginModel model) throws ParseException, AccessDeniedException {

		try {
			if (Objects.isNull(model))
				throw new AccessDeniedException("No data entered");
			else
				return accessService.regUser(model);
		} catch (AccessDeniedException e) {
			logger.error("No data entered");
			throw new AccessDeniedException("No data entered");
		}

	}

}
