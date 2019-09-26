package com.cg.ecm.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.ecm.dto.Expense;

@Repository
public interface ExpenseRepo extends CrudRepository<Expense, Integer>{

}
