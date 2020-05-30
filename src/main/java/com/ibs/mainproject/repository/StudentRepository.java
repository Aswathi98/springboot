package com.ibs.mainproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ibs.mainproject.entity.Student;
import com.ibs.mainproject.model.MailModel;
import com.ibs.mainproject.model.MailModelDet;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query("select new com.ibs.mainproject.model.MailModel(a.studentName, a.studentEmail) from Student a where a.litmusBatch=:litmusBatch")
	List<MailModel> getByBatchName(@Param("litmusBatch") String litmusBatch);
	
	@Query("select distinct s.litmusBatch from Student s where s.litmusBatch is not null")
	List<String> getBatchNames();
	
	@Query("select new com.ibs.mainproject.model.MailModelDet(a.studentName, a.studentEmail, a.amcatId, a.studentMobile) from Student a where a.litmusBatch=:litmusBatch")
	List<MailModelDet> getByBatchDetails(@Param("litmusBatch") String litmusBatch);
}