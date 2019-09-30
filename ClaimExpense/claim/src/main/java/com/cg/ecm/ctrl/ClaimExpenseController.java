package com.cg.ecm.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.cg.ecm.dto.EmployeeCode;
import com.cg.ecm.dto.Expense;
import com.cg.ecm.dto.ExpenseClaimed;
import com.cg.ecm.dto.Project;
import com.cg.ecm.repository.ExpenseClaimRepo;
import com.cg.ecm.service.ClaimExpenseService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/claimExpense")
public class ClaimExpenseController {

	@Autowired
	ClaimExpenseService ser;

	@Autowired
	ExpenseClaimRepo rep;

	@PostMapping("/AddClaim")
	public void AddClaim(@RequestBody ExpenseClaimed ecm) {
		ser.createExpense(ecm);
	}

	@RequestMapping(value = "/AllExpenses/", method = RequestMethod.GET)
	public ArrayList<Expense> getAllExpenses()	{
		return ser.findAllExpenses();
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public EmployeeCode getEmployee(@PathVariable("id") int id)	{
		return ser.findEmployee(id);
	}

	@RequestMapping(value = "/AllProjects/", method = RequestMethod.GET)
	public ArrayList<Project> getAllProjects()	{
		return ser.findAllProject();
	}

	@RequestMapping(value = "/AllEmployee/", method = RequestMethod.GET)
	public List<EmployeeCode> getAllEmployee()	{
		return ser.findAllEmployees();
	}

	@DeleteMapping(path = "/deleteExpense/{id}")
	public ExpenseClaimed deleteUser(@PathVariable("id") int uId) {
		if(rep.findById(uId).isPresent()) {
			ExpenseClaimed expClm = rep.findById(uId).get();
			ser.deleteById(uId);
			return expClm;
		}
		return null;
	}

	@GetMapping("/view/{id}")
	public ExpenseClaimed viewExpense(@PathVariable("id") int id) {
		return ser.viewExpense(id);
	}

	@GetMapping("/view/")
	public Iterable<ExpenseClaimed> getAll()    {
		return ser.getAll();
	}

	@PutMapping("/update/")
	public ExpenseClaimed update(@RequestBody ExpenseClaimed claim) {
		return ser.update(claim);
	}

}