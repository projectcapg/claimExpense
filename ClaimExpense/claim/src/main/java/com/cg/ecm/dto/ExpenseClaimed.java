package com.cg.ecm.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Represents an Expense Claimed
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

	/**
	 * Gets the Employee Id.
	 * 
	 * @return A Integer representing the Employee's ID.
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * Sets the Employee's ID.
	 * 
	 * @param employeeId A Integer containing the Employee's ID.
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * Gets the Project's Code.
	 * 
	 * @return A Integer representing the Project's Code.
	 */
	public int getProjectCode() {
		return projectCode;
	}

	/**
	 * Sets the Project's Code.
	 * 
	 * @param projectCode A Integer containing the Project's Code.
	 */
	public void setProjectCode(int projectCode) {
		this.projectCode = projectCode;
	}

	/**
	 * Gets the Expense's Code.
	 * 
	 * @return A Integer representing the Expense's Code.
	 */
	public int getExpenseCode() {
		return expenseCode;
	}

	/**
	 * Sets the Expense's Code.
	 * 
	 * @param expenseCode A Integer containing the Expense's Code.
	 */
	public void setExpenseCode(int expenseCode) {
		this.expenseCode = expenseCode;
	}

	/**
	 * Gets the Project's Start Date.
	 * 
	 * @return A Date representing the Project's Start Date.
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the Project's Start Date.
	 * 
	 * @param startDate A Date containing the Project's Start Date.
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the Project's end Date.
	 * 
	 * @return A Date representing the Project's end Date.
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Sets the Project's end Date.
	 * 
	 * @param endDate A Date containing the Project's end Date.
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Gets the Expense's Amount.
	 * 
	 * @return A Double representing the Expense's Amount.
	 */
	public double getExpenseAmount() {
		return expenseAmount;
	}

	/**
	 * Sets the Expense's Amount.
	 * 
	 * @param expenseAmount A Double containing the Expense's Amount.
	 */
	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	/**
	 * Gets the Expense's Code ID.
	 * 
	 * @return A Integer representing the Expense's Code ID.
	 */
	public int getExpenseCodeId() {
		return expenseCodeId;
	}

	/**
	 * Sets the Expense's Code ID.
	 * 
	 * @param expenseCodeId A Integer containing the Expense's Code ID.
	 */
	public void setExpenseCodeId(int expenseCodeId) {
		this.expenseCodeId = expenseCodeId;
	}

	/**
	 * Creates an Expense Claim with the specified Id.
	 * 
	 * @param employeeId    The employee's Id.
	 * @param projectCode   The Project's Code.
	 * @param expenseCode   The Expense's Code.
	 * @param startDate     The Project's Start Date.
	 * @param endDate       The Project's end Date.
	 * @param expenseAmount The Expense Amount for the Project.
	 * @param expenseCodeId The Expense's Claim Id.
	 */
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

	/**Create a Expense Claim without any Details
     * 
     */
	public ExpenseClaimed() {
		super();
	}

	/**
     * Returns The Expense Claim Details
     * 
     * @return a string representing the details about Expense Claim
     */
	@Override
	public String toString() {
		return "ExpenseClaimed [employeeId=" + employeeId + ", projectCode=" + projectCode + ", expenseCode="
				+ expenseCode + ", startDate=" + startDate + ", endDate=" + endDate + ", expenseAmount=" + expenseAmount
				+ ", expenseCodeId=" + expenseCodeId + "]";
	}

	/**
	 * Creates an Expense Claim with the specified Id.
	 * 
	 * @param employeeId    The employee's Id.
	 * @param projectCode   The Project's Code.
	 * @param expenseCode   The Expense's Code.
	 * @param startDate     The Project's Start Date.
	 * @param endDate       The Project's end Date.
	 * @param expenseAmount The Expense Amount for the Project.
	 */
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