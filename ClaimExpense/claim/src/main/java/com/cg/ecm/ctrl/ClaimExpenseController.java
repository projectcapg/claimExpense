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
import com.cg.ecm.exception.ItemNotFoundException;
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
	public void AddClaim(@RequestBody ExpenseClaimed ecm) throws ItemNotFoundException {
		ExpenseClaimed claim= ser.createExpense(ecm);
		if(claim==null)
			throw new ItemNotFoundException("Claim could not be added");
			
	}

	@RequestMapping(value = "/AllExpenses/", method = RequestMethod.GET) 
	public ArrayList<Expense> getAllExpenses()	throws ItemNotFoundException {
		ArrayList<Expense> expenses= ser.findAllExpenses();
		if(expenses==null)
			throw new ItemNotFoundException("No Expenses Found");
		else
		   return expenses;
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public EmployeeCode getEmployee(@PathVariable("id") int id)	throws ItemNotFoundException{
		EmployeeCode emp=ser.findEmployee(id);
		if(emp==null)
			throw new ItemNotFoundException("No Employee found with this ID");
		else
			return emp;
	}

	@RequestMapping(value = "/AllProjects/", method = RequestMethod.GET)
	public ArrayList<Project> getAllProjects()	throws ItemNotFoundException{
		ArrayList<Project> projects= ser.findAllProject();
		if(projects==null)
			throw new ItemNotFoundException("No project found");
		else
			return projects;
	}

	@RequestMapping(value = "/AllEmployee/", method = RequestMethod.GET)
	public List<EmployeeCode> getAllEmployee()	throws ItemNotFoundException{
		List<EmployeeCode> employees= ser.findAllEmployees();
		if(employees==null)
			throw new ItemNotFoundException("No employees found");
		else
			return employees;
	}

	@DeleteMapping(path = "/deleteExpense/{id}")
	public ExpenseClaimed deleteUser(@PathVariable("id") int uId) throws ItemNotFoundException {
		if(rep.findById(uId).isPresent()) {
			ExpenseClaimed expClm = rep.findById(uId).get();
			ser.deleteById(uId);
			return expClm;
		}
		return null;
	}

	@GetMapping("/view/{id}")
	public ExpenseClaimed viewExpense(@PathVariable("id") int id) throws ItemNotFoundException{
		ExpenseClaimed claim= ser.viewExpense(id);
		if(claim==null)
			throw new ItemNotFoundException("No claim found with this ID");
		else
			return claim;
		
	}

	@GetMapping("/view/")
	public Iterable<ExpenseClaimed> getAll()   throws ItemNotFoundException {
		Iterable<ExpenseClaimed> claims= ser.getAll();
		if(claims==null)
			throw new ItemNotFoundException("No claims found");
		else
			return claims;
		
	}

	@PutMapping("/update/")
	public ExpenseClaimed update(@RequestBody ExpenseClaimed claim) throws ItemNotFoundException{
		
		ExpenseClaimed updatedClaim= ser.update(claim);
		if(updatedClaim==null)
			throw new ItemNotFoundException("Claim could not be updated");
		else
			return updatedClaim;
	}

}