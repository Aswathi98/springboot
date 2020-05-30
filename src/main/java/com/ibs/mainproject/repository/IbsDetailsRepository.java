package com.ibs.mainproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibs.mainproject.entity.IbsDetails;

@Repository
public interface IbsDetailsRepository extends JpaRepository<IbsDetails, String> {

}