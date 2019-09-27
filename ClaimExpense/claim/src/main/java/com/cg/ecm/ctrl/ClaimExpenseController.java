package com.cg.ecm.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cg.ecm.dto.EmployeeCode;
import com.cg.ecm.dto.Expense;
import com.cg.ecm.dto.ExpenseClaimed;
import com.cg.ecm.dto.Project;
import com.cg.ecm.exception.ItemNotFoundException;
import com.cg.ecm.service.ClaimExpenseService;

@RestController
public class ClaimExpenseController {

	@Autowired
	ClaimExpenseService ser;
	
	@PostMapping("/claimExpense")
	public ExpenseClaimed createExpense(@RequestBody ExpenseClaimed exp)
	{
		ser.createExpense(exp);
		return exp;
	}
	
	@GetMapping("/claimExpense/getEmployee/{id}")
	public EmployeeCode getEmployee(@PathVariable("id") int id) throws ItemNotFoundException
	{
		EmployeeCode emp= ser.getEmployee(id);
		if(emp==null)
			throw new ItemNotFoundException("No Employee Found With this ID");
		else
			return emp;
	}
	
	@GetMapping("/claimExpense/getExpense/{id}")
	public Expense getExpense(@PathVariable("id") int id) throws ItemNotFoundException
	{
		Expense exp= ser.getExpense(id);
		if(exp==null)
			throw new ItemNotFoundException("No Expense found with this Id");
		else
			return exp;
	}
	
	@GetMapping("/claimExpense/getProject/{id}")
	public Project getProject(@PathVariable("id") long id) throws ItemNotFoundException
	{
		Project pro= ser.getProject(id);
		if(pro==null)
			throw new ItemNotFoundException("No Project Found with this ID");
		else
			return pro;
	}
	
	@GetMapping("/claimExpense/getAllEmployees")
	public Iterable<EmployeeCode> getEmployees()
	{
		return ser.getEmployees();
	}
	
//	@RequestMapping("/claimExpense/Hello/")
//	public String check()
//	{
//		return "Hi, Welcome";
//	}
//	
	
	
}
