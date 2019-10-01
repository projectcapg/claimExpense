package com.cg.ecm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.ecm.dto.ExpenseClaimed;

@Repository
public interface ExpenseClaimRepo extends CrudRepository<ExpenseClaimed, Integer> {

}