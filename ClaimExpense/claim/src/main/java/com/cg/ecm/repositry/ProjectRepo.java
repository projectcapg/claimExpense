package com.cg.ecm.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.ecm.dto.Project;

@Repository
public interface ProjectRepo extends CrudRepository<Project, Long>{

}
