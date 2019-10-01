package com.cg.ecm.dto;

import java.sql.Date;

/**
 * Represents an Employee
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
public class EmployeeCode {
    private int empId;
    private String empName;
    private String empPAN;
    private String empDesg;
    private String empDomain;
    private Date empDOJ;
    private Date empDOB;
    private float empSal;
    private String empMail;
    private String empPassword;

    /**
     * Gets the employee’s ID.
     * 
     * @return A Integer representing the employee’s ID.
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * Sets the employee’s ID.
     * 
     * @param empId A Integer containing the employee’s ID.
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     * Gets the employee’s Name.
     * 
     * @return A string representing the employee’s Name.
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Sets the employee’s Name.
     * 
     * @param empName A String containing the employee’s Name.
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * Gets the employee’s PAN Number.
     * 
     * @return A string representing the employee’s PAN Number.
     */
    public String getEmpPAN() {
        return empPAN;
    }

    /**
     * Sets the employee’s PAN Number.
     * 
     * @param empPAN A String containing the employee’s PAN Number.
     */
    public void setEmpPAN(String empPAN) {
        this.empPAN = empPAN;
    }

    /**
     * Gets the employee’s Designation.
     * 
     * @return A string representing the employee’s Designation.
     */
    public String getEmpDesg() {
        return empDesg;
    }

    /**
     * Sets the employee’s Designation.
     * 
     * @param empDesg A String containing the employee’s Designation.
     */
    public void setEmpDesg(String empDesg) {
        this.empDesg = empDesg;
    }

    /**
     * Gets the employee’s Domain.
     * 
     * @return A string representing the employee’s Domain.
     */
    public String getEmpDomain() {
        return empDomain;
    }

    /**
     * Sets the employee’s Domain.
     * 
     * @param empDomain A String containing the employee’s Domain.
     */
    public void setEmpDomain(String empDomain) {
        this.empDomain = empDomain;
    }

    /**
     * Gets the employee’s Date of Joining.
     * 
     * @return A Date representing the employee’s Date of Joining.
     */
    public Date getEmpDOJ() {
        return empDOJ;
    }

    /**
     * Sets the employee’s Date of Joining.
     * 
     * @param empDOJ A String containing the employee’s Date of Joining.
     */
    public void setEmpDOJ(Date empDOJ) {
        this.empDOJ = empDOJ;
    }

    /**
     * Gets the employee’s Date of Birth.
     * 
     * @return A Date representing the employee’s Date of Birth.
     */
    public Date getEmpDOB() {
        return empDOB;
    }

    /**
     * Sets the employee’s Date of Birth.
     * 
     * @param empDOB A String containing the employee’s Date of Birth.
     */
    public void setEmpDOB(Date empDOB) {
        this.empDOB = empDOB;
    }

    /**
     * Gets the employee’s Salary.
     * 
     * @return A Double representing the employee’s Salary.
     */
    public float getEmpSal() {
        return empSal;
    }

    /**
     * Sets the employee’s Salary.
     * 
     * @param empSal A String containing the employee’s Salary.
     */
    public void setEmpSal(float empSal) {
        this.empSal = empSal;
    }

    /**
     * Gets the employee’s Mail.
     * 
     * @return A string representing the employee’s Mail.
     */
    public String getEmpMail() {
        return empMail;
    }

    /**
     * Sets the employee’s Mail.
     * 
     * @param empMail A String containing the employee’s Mail.
     */
    public void setEmpMail(String empMail) {
        this.empMail = empMail;
    }

    /**
     * Gets the employee’s Password.
     * 
     * @return A string representing the employee’s Password.
     */
    public String getEmpPassword() {
        return empPassword;
    }

    /**
     * Sets the employee’s Password.
     * 
     * @param empPassword A String containing the employee’s Password.
     */
    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    /**
     * Returns The employee
     * 
     * @return a string representing the details about employee
     */
    @Override
    public String toString() {
        return "EmployeeCode [empId=" + empId + ", empName=" + empName + ", empPAN=" + empPAN + ", empDesg=" + empDesg
                + ", empDomain=" + empDomain + ", empDOJ=" + empDOJ + ", empDOB=" + empDOB + ", empSal=" + empSal
                + ", empMail=" + empMail + ", empPassword=" + empPassword + "]";
    }

    /**
     * Creates an employee with the specified ID.
     * 
     * @param empName     The employee’s name.
     * @param empId       The employee's Id
     * @param empPAN      The employee's pan
     * @param empDesg     The employee's Designation
     * @param empDomain   The employee's Working Domain
     * @param empDOJ      The employee's Date of Joining
     * @param empDOB      The employee's Date of Birth
     * @param empSal      The employee's Salary
     * @param empMail     The employee's Mail
     * @param empPassword The employee's Password
     */
    public EmployeeCode(int empId, String empName, String empPAN, String empDesg, String empDomain, Date empDOJ,
            Date empDOB, float empSal, String empMail, String empPassword) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empPAN = empPAN;
        this.empDesg = empDesg;
        this.empDomain = empDomain;
        this.empDOJ = empDOJ;
        this.empDOB = empDOB;
        this.empSal = empSal;
        this.empMail = empMail;
        this.empPassword = empPassword;
    }

    /**Create a Employee without any Details
     * 
     */
    public EmployeeCode() {
        super();
    }
}