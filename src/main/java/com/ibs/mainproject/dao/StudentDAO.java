package com.ibs.mainproject.dao;


import java.text.ParseException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibs.mainproject.entity.College;
import com.ibs.mainproject.entity.IbsDetails;
import com.ibs.mainproject.entity.Student;
import com.ibs.mainproject.model.UpdateModel;
import com.ibs.mainproject.model.UploadModel;
import com.ibs.mainproject.repository.StudentRepository;

@Component
public class StudentDAO {
	
	@Autowired
	StudentRepository studentRepository;
	@Autowired 
    CollegeDAO collegeDAO;
    @Autowired
    IbsDetailsDAO ibsDetailsDAO;
    

	@Transactional
	public Student save(UploadModel uploadModel) throws ParseException{
		Student student= new Student();
		College college=new College();
		IbsDetails ibsDetails=new IbsDetails();
		
				student.setStudentName(uploadModel.getStudentName());
				student.setStudentMobile(uploadModel.getStudentMobile());
				student.setStudentEmail(uploadModel.getStudentEmail());
				student.setAmcatId(uploadModel.getAmcatId());
				student.setGender(uploadModel.getGender());
				student.setMarkTenth(uploadModel.getMarkTenth());
				student.setMarkTwelve(uploadModel.getMarkTwelve());
				student.setStudentAddress(uploadModel.getStudentAddress());
				student.setYearOfGraduation(uploadModel.getYearOfGraduation());
				student.setCollegeMarks(uploadModel.getCollegeMarks());
				student.setAdditionalContactNumber(uploadModel.getAdditionalContactNumber());
				student.setAddtionalEmailId(uploadModel.getAddtionalEmailId());
				student.setStudentRemarks(uploadModel.getStudentRemarks());
				student.setStudentAdditionalRemarks(uploadModel.getStudentAdditionalRemarks());
				student.setStudentBranch(uploadModel.getStudentBranch());
				student.setStudentCourse(uploadModel.getStudentCourse());
				student.setCollegePercentage(uploadModel.getCollegePercentage());
				student.setLitmusBatch(uploadModel.getLitmusBatch());
				student.setCreatedTime(uploadModel.currentDate());
				college=collegeDAO.save(uploadModel);
		        ibsDetails=ibsDetailsDAO.save(uploadModel);
		        student.setCollege(college);
		        student.setIbsDetails(ibsDetails);
		        studentRepository.save(student);
				return student;
	}
		
	@Transactional
	public Student save(UpdateModel updateModel){
		
		Student student= new Student();
		College college=new College();
		IbsDetails ibsDetails=new IbsDetails();
		
		student=studentRepository.findOne(updateModel.getAmcatId());
		student.setStudentName(updateModel.getStudentName());
		student.setStudentMobile(updateModel.getStudentMobile());
		student.setStudentEmail(updateModel.getStudentEmail());
		student.setAmcatId(updateModel.getAmcatId());
		student.setGender(updateModel.getGender());
		student.setMarkTenth(updateModel.getMarkTenth());
		student.setMarkTwelve(updateModel.getMarkTwelve());
		student.setStudentAddress(updateModel.getStudentAddress());
		student.setYearOfGraduation(updateModel.getYearOfGraduation());
		student.setCollegeMarks(updateModel.getCollegeMarks());
		student.setAdditionalContactNumber(updateModel.getAdditionalContactNumber());
		student.setAddtionalEmailId(updateModel.getAddtionalEmailId());
		student.setStudentRemarks(updateModel.getStudentRemarks());
		student.setStudentAdditionalRemarks(updateModel.getStudentAdditionalRemarks());
		student.setStudentBranch(updateModel.getStudentBranch());
		student.setStudentCourse(updateModel.getStudentCourse());
		student.setCollegePercentage(updateModel.getCollegePercentage());
		student.setLitmusBatch(updateModel.getLitmusBatch());
		student.setBackgroundVerification(updateModel.getBackgroundVerification());
		college=collegeDAO.save(updateModel);
  	    ibsDetails=ibsDetailsDAO.save(updateModel);
  	    student.setCollege(college);
	    student.setIbsDetails(ibsDetails);
		studentRepository.save(student);
    	
		return student;
	
	}
}
