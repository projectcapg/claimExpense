package com.cg.ecm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import com.cg.ecm.dto.EmployeeCode;
import com.cg.ecm.dto.Expense;
import com.cg.ecm.dto.ExpenseClaimed;
import com.cg.ecm.dto.Project;
import com.cg.ecm.repository.ExpenseClaimRepo;

@Service
@Transactional
public class ClaimExpenseServiceImpl implements ClaimExpenseService {

    @Autowired
    ExpenseClaimRepo claimRepo;

    @Autowired
    RestTemplate resttemp;

    public ArrayList<Project> projects;

    public List<EmployeeCode> employees;

    public ArrayList<Expense> expenses;

    public ExpenseClaimed createExpense(ExpenseClaimed exp) {
        claimRepo.save(exp);
        return exp;
    }

    @SuppressWarnings("unchecked")
    public List<EmployeeCode> findAllEmployees() throws RestClientException {
        String url = "http://localhost:8081/employeecode/display/";
        URI uri = URI.create(url);
        this.employees = resttemp.getForObject(uri, List.class);
        return this.employees;
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Project> findAllProject() {
        String url = "http://localhost:8083/project/";
        URI uri = URI.create(url);
        this.projects = resttemp.getForObject(uri, ArrayList.class);
        return this.projects;
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Expense> findAllExpenses() {
        String url = "http://localhost:8082/ExpenseCode/displayall/";
        URI uri = URI.create(url);
        this.expenses = resttemp.getForObject(uri, ArrayList.class);
        return this.expenses;
    }

    @Override
	public void deleteById(int id){
		claimRepo.deleteById(id);
    }
    
	public ExpenseClaimed viewExpense(int id) {
		ExpenseClaimed ec = null;
		ec =  claimRepo.findById(id).get();
		return ec;
	}
	
	public Iterable<ExpenseClaimed> getAll()    {
		return claimRepo.findAll();
    }

	public ExpenseClaimed update(ExpenseClaimed claim) {
		claimRepo.save(claim);
		return claim;
	}

    @Override
    public EmployeeCode findEmployee(int id) {
        EmployeeCode emp = null;
        for(int i=0;i<employees.size();i++) {
            if(employees.get(i).getEmpId() == id)   {
                emp = employees.get(i);
                break;
            }
        }
        return emp;
    }
}