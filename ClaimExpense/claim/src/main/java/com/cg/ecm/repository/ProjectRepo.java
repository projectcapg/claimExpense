package com.cg.ecm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.ecm.dto.Project;

@Repository
public interface ProjectRepo extends CrudRepository<Project, Long>{

}