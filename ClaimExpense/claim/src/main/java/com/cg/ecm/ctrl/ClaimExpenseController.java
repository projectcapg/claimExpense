package com.cg.ecm.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ecm.dto.EmployeeCode;
import com.cg.ecm.repository.EmployeeCodeRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClaimExpenseController {

	@Autowired
	EmployeeCodeRepo empRepo;

	@GetMapping("/claimExpense/getEmployee/{id}")
	public EmployeeCode getEmployee(@PathVariable("id") int id)
	{
		return empRepo.findById(id).get();
	}
}