package com.cg.ecm.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cg.ecm.dto.EmployeeCode;
import com.cg.ecm.dto.Expense;
import com.cg.ecm.dto.ExpenseClaimed;
import com.cg.ecm.dto.Project;
import com.cg.ecm.repositry.EmployeeCodeRepo;
import com.cg.ecm.repositry.ExpenseClaimRepo;
import com.cg.ecm.repositry.ExpenseRepo;
import com.cg.ecm.repositry.ProjectRepo;

@RestController
public class ClaimExpenseController {

	@Autowired
	ExpenseClaimRepo claimRepo;
	
	@Autowired
	EmployeeCodeRepo empRepo;
	
	@Autowired
	ExpenseRepo expRepo;
	
	@Autowired
	ProjectRepo proRepo;
	
	@PostMapping("/claimExpense")
	public ExpenseClaimed createExpense(@RequestBody ExpenseClaimed exp)
	{
		claimRepo.save(exp);
		return exp;
	}
	
	@GetMapping("/claimExpense/getEmployee/{id}")
	public EmployeeCode getEmployee(@PathVariable("id") int id)
	{
		return empRepo.findById(id).get();
	}
	
	@GetMapping("/claimExpense/getExpense/{id}")
	public Expense getExpense(@PathVariable("id") int id)
	{
		return expRepo.findById(id).get();
	}
	
	@GetMapping("/claimExpense/getProject/{id}")
	public Project getProject(@PathVariable("id") long id)
	{
		return proRepo.findById(id).get();
	}
	
	@GetMapping("/claimExpense/getAllEmployees")
	public Iterable<EmployeeCode> getEmployees()
	{
		return empRepo.findAll();
	}
	
	@RequestMapping("/claimExpense/Hello/")
	public String check()
	{
		return "Hi, Welcome";
	}
	
	
	
}
