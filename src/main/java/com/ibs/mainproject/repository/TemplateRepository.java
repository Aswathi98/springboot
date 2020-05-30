package com.ibs.mainproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibs.mainproject.entity.Template;

@Repository
public interface TemplateRepository extends JpaRepository<Template,String>{
	@Query("select t.templateType from Template t")
	List<String> getByTypeNames();

}