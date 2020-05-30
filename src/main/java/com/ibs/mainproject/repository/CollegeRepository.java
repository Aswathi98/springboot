
package com.ibs.mainproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibs.mainproject.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, String>{
      

}
