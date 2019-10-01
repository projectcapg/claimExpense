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

/**
 * Represents a Rest Controller class. It uses REST API to do CRUD operations.
 * 
 * @author Durgesh Singh
 * @author Hari Galla
 * @author Soham Kasar
 * @author Lalit Kumar
 * @author Amanjot Singh
 * @author Adarsh Gupta
 * @author Vivek Kumar
 * @author Amit Yadav
 * @version 1.0
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/claimExpense")
public class ClaimExpenseController {

	@Autowired
	ClaimExpenseService ser;

	@Autowired
	ExpenseClaimRepo rep;

	/**
	 * Adds an Expense Claim
	 * 
	 * @param ecm An ExpenseClaimed object containing all the details about a claim.
	 */
	@PostMapping("/AddClaim")
	public void AddClaim(@RequestBody ExpenseClaimed ecm) {
		ser.createExpense(ecm);
	}

	/**
	 * Gets all the Expenses
	 * 
	 * @return An ArrayList consisting all the expenses
	 */
	@RequestMapping(value = "/AllExpenses/", method = RequestMethod.GET)
	public ArrayList<Expense> getAllExpenses() {
		return ser.findAllExpenses();
	}

	/**
	 * Gets an Employee with a specific employee ID
	 * 
	 * @param id An integer containing ID of an employee to be searched
	 * @return An Employee object after searching with the given employee ID.
	 */
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public EmployeeCode getEmployee(@PathVariable("id") int id) {
		return ser.findEmployee(id);
	}

	/**
	 * Gets all the projects
	 * 
	 * @return An ArrayList consisting all the Projects
	 */
	@RequestMapping(value = "/AllProjects/", method = RequestMethod.GET)
	public ArrayList<Project> getAllProjects() {
		return ser.findAllProject();
	}

	/**
	 * Gets all the Employees
	 * 
	 * @return An List consisting all Employees
	 */
	@RequestMapping(value = "/AllEmployee/", method = RequestMethod.GET)
	public List<EmployeeCode> getAllEmployee() {
		return ser.findAllEmployees();
	}

	/**
	 * Deletes an Expense Claim
	 * 
	 * @param uId An integer consisting ID of the Expense Claim to be deleted
	 * @return Expense Claim object which has been deleted
	 */
	@DeleteMapping(path = "/deleteExpense/{id}")
	public ExpenseClaimed deleteUser(@PathVariable("id") int uId) {
		if (rep.findById(uId).isPresent()) {
			ExpenseClaimed expClm = rep.findById(uId).get();
			ser.deleteById(uId);
			return expClm;
		}
		return null;
	}

	/**
	 * Gets an Expense Claim with a specific ID
	 * 
	 * @param id An integer consisting ID of the Expense Claim to be searched
	 * @return An Expense Claim object after searching using the id
	 */
	@GetMapping("/view/{id}")
	public ExpenseClaimed viewExpense(@PathVariable("id") int id) {
		return ser.viewExpense(id);
	}

	/**
	 * Gets all the Expense Claims
	 * 
	 * @return All the Expense Claims
	 */
	@GetMapping("/view/")
	public Iterable<ExpenseClaimed> getAll() {
		return ser.getAll();
	}

	/**
	 * Updates an Expense Claim
	 * 
	 * @param claim Updated Expense Claim object
	 * @return Expense Claim object after update operation
	 */
	@PutMapping("/update/")
	public ExpenseClaimed update(@RequestBody ExpenseClaimed claim) {
		return ser.update(claim);
	}

}