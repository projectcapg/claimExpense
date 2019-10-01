package com.cg.ecm.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

import java.util.List;

import com.cg.ecm.dto.EmployeeCode;
import com.cg.ecm.dto.Expense;
import com.cg.ecm.dto.ExpenseClaimed;
import com.cg.ecm.dto.Project;

/**
 * Represents a Service class with all the required functions.
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
@Service
@Transactional
public interface ClaimExpenseService {
    public ExpenseClaimed createExpense(ExpenseClaimed exp);

    public List<EmployeeCode> findAllEmployees();

    public ArrayList<Project> findAllProject();

    public ArrayList<Expense> findAllExpenses();

    public void deleteById(int id);

    public ExpenseClaimed viewExpense(int id);

    public Iterable<ExpenseClaimed> getAll();

    public ExpenseClaimed update(ExpenseClaimed claim);

    public EmployeeCode findEmployee(int id);
}