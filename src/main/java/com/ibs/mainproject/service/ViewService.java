package com.ibs.mainproject.service;

import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.mainproject.dao.ViewDAO;
import com.ibs.mainproject.entity.College;
import com.ibs.mainproject.entity.IbsDetails;
import com.ibs.mainproject.entity.Student;
import com.ibs.mainproject.model.UpdateModel;
import com.ibs.mainproject.repository.StudentRepository;
import com.ibs.mainproject.exception.ResourceNotFoundException;

@Service
public class ViewService {
	Logger logger = LoggerFactory.getLogger(ViewService.class);
	@Autowired
	ViewDAO viewDAO;
	@Autowired
	StudentRepository studentRepo;

	public List<UpdateModel> viewData() throws ResourceNotFoundException {
		logger.info(" ViewService viewData is invoked");
		List<UpdateModel> listUpdateModel = new ArrayList<>();
		List<Student> listStudent = viewDAO.viewData();
		
		listStudent.stream().forEach(std->{
			UpdateModel updateModel = new UpdateModel();
			
			College college = new College();
			IbsDetails ibsDetails = new IbsDetails();
			
			updateModel.setAmcatId(std.getAmcatId());
			updateModel.setStudentName(std.getStudentName());
			updateModel.setStudentMobile(std.getStudentMobile());
			updateModel.setStudentEmail(std.getStudentEmail());

			updateModel.setGender(std.getGender());
			updateModel.setMarkTenth(std.getMarkTenth());
			updateModel.setMarkTwelve(std.getMarkTwelve());
			updateModel.setStudentAddress(std.getStudentAddress());
			updateModel.setYearOfGraduation(std.getYearOfGraduation());
			updateModel.setBackgroundVerification(std.getBackgroundVerification());
			updateModel.setCollegeMarks(std.getCollegeMarks());
			updateModel.setCreatedTime(std.getCreatedTime());
			updateModel.setModifiedTime(std.getModifiedTime());
			updateModel.setAdditionalContactNumber(std.getAdditionalContactNumber());
			updateModel.setAddtionalEmailId(std.getAddtionalEmailId());
			updateModel.setStudentRemarks(std.getStudentRemarks());
			updateModel.setStudentAdditionalRemarks(std.getStudentAdditionalRemarks());
			updateModel.setStudentBranch(std.getStudentBranch());
			updateModel.setStudentCourse(std.getStudentCourse());
			updateModel.setCollegePercentage(std.getCollegePercentage());
			updateModel.setLitmusBatch(std.getLitmusBatch());
			
			college = std.getCollege();
			updateModel.setCollegeName(college.getCollegeName());
			updateModel.setCollegeAddress(college.getCollegeAddress());
			updateModel.setNameOfPlacementOfficer(college.getNameOfPlacementOfficer());
			updateModel.setNumberOfPlacementOfficer(college.getNumberOfPlacementOfficer());
			updateModel.setEmailOfPlacementOfficer(college.getEmailOfPlacementOfficer());
			updateModel.setCreatedTime(college.getCreatedTime());
			updateModel.setUniversity(college.getUniversity());
			updateModel.setModifiedTime(college.getModifiedTime());

			ibsDetails = std.getIbsDetails();
			updateModel.setVenueOfDrive(ibsDetails.getVenueOfDrive());
			updateModel.setStudentBranch(std.getStudentBranch());
			updateModel.setStudentCourse(std.getStudentCourse());
			updateModel.setDateOfDrive(ibsDetails.getDateOfDrive());
			updateModel.setPreLearningLink(ibsDetails.getPreLearningLink());
			updateModel.setModifiedTime(ibsDetails.getModifiedTime());
			updateModel.setCreatedTime(ibsDetails.getCreatedTime());
			updateModel.setLitmusStatus(ibsDetails.getLitmusStatus());

			updateModel.setCollegePercentage(std.getCollegePercentage());

			listUpdateModel.add(updateModel);
		});
		

		return listUpdateModel;
	}

}
