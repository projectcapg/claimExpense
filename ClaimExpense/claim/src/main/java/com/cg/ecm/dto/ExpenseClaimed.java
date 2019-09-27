package com.cg.ecm.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class ExpenseClaimed {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 100)
	private int expenseCodeId;
	private int employeeId;
	private int projectCode;
	private int expenseCode;
	private Date startDate;
	private Date endDate;
	private double expenseAmount;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(int projectCode) {
		this.projectCode = projectCode;
	}

	public int getExpenseCode() {
		return expenseCode;
	}

	public void setExpenseCode(int expenseCode) {
		this.expenseCode = expenseCode;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public int getExpenseCodeId() {
		return expenseCodeId;
	}

	public void setExpenseCodeId(int expenseCodeId) {
		this.expenseCodeId = expenseCodeId;
	}

	public ExpenseClaimed(int employeeId, int projectCode, int expenseCode, Date startDate, Date endDate,
			double expenseAmount, int expenseCodeId) {
		super();
		this.employeeId = employeeId;
		this.projectCode = projectCode;
		this.expenseCode = expenseCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.expenseAmount = expenseAmount;
		this.expenseCodeId = expenseCodeId;
	}

	public ExpenseClaimed() {
		super();
	}

	@Override
	public String toString() {
		return "ExpenseClaimed [employeeId=" + employeeId + ", projectCode=" + projectCode + ", expenseCode="
				+ expenseCode + ", startDate=" + startDate + ", endDate=" + endDate + ", expenseAmount=" + expenseAmount
				+ ", expenseCodeId=" + expenseCodeId + "]";
	}

	public ExpenseClaimed(int employeeId, int projectCode, int expenseCode, Date startDate, Date endDate,
			double expenseAmount) {
		this.employeeId = employeeId;
		this.projectCode = projectCode;
		this.expenseCode = expenseCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.expenseAmount = expenseAmount;
	}

}