package com.cg.ecm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.ecm.dto.EmployeeCode;

@Repository
public interface EmployeeCodeRepo extends CrudRepository<EmployeeCode, Integer> {

}