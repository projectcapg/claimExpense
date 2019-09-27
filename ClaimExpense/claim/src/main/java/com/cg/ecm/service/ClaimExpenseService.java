package com.cg.ecm.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.ecm.dto.EmployeeCode;
import com.cg.ecm.dto.Expense;
import com.cg.ecm.dto.ExpenseClaimed;
import com.cg.ecm.dto.Project;
import com.cg.ecm.exception.ItemNotFoundException;

public interface ClaimExpenseService {

	public ExpenseClaimed createExpense(@RequestBody ExpenseClaimed exp);
	
	public EmployeeCode getEmployee(@PathVariable("id") int id) throws ItemNotFoundException;
	
	public Expense getExpense(@PathVariable("id") int id) throws ItemNotFoundException;
	
	public Project getProject(@PathVariable("id") long id) throws ItemNotFoundException;
	
	public Iterable<EmployeeCode> getEmployees();
}
