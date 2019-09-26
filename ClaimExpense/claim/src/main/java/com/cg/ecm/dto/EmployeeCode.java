package com.cg.ecm.dto;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_code")
public class EmployeeCode
{
    @Id
    @Column(name = "id")
    private int empId;

    @Column(name = "name")
    private String empName;

    @Column(name = "pan")
    private String empPAN;

    @Column(name = "designation")
    private String empDesg;

    @Column(name = "domain")
    private String empDomain;

    @Column(name = "DOJ")
    private Date empDOJ;

    @Column(name = "DOB")
    private Date empDOB;

    @Column(name = "salary")
    private float empSal;

    @Column(name = "mail")
    private String empMail;

    @Column(name = "password")
    private String empPassword;

    public int getEmpId() {

        return empId;

    }

    public void setEmpId(int empId) {

        this.empId = empId;

    }

    public String getEmpName() {

        return empName;

    }

    public void setEmpName(String empName) {

        this.empName = empName;

    }

    public String getEmpPAN() {

        return empPAN;

    }

    public void setEmpPAN(String empPAN) {

        this.empPAN = empPAN;

    }

    public String getEmpDesg() {

        return empDesg;

    }

    public void setEmpDesg(String empDesg) {

        this.empDesg = empDesg;

    }

    public String getEmpDomain() {

        return empDomain;

    }

    public void setEmpDomain(String empDomain) {

        this.empDomain = empDomain;

    }

    public Date getEmpDOJ() {

        return empDOJ;

    }

    public void setEmpDOJ(Date empDOJ) {

        this.empDOJ = empDOJ;

    }

    public Date getEmpDOB() {

        return empDOB;

    }

    public void setEmpDOB(Date empDOB) {

        this.empDOB = empDOB;

    }

    public float getEmpSal() {

        return empSal;

    }

    public void setEmpSal(float empSal) {

        this.empSal = empSal;

    }

    public String getEmpMail() {

        return empMail;

    }

    public void setEmpMail(String empMail) {

        this.empMail = empMail;

    }

    public String getEmpPassword() {

        return empPassword;

    }

    public void setEmpPassword(String empPassword) {

        this.empPassword = empPassword;

    }

    @Override

    public String toString() {
        return "EmployeeCode [empId=" + empId + ", empName=" + empName + ", empPAN=" + empPAN + ", empDesg=" + empDesg
                + ", empDomain=" + empDomain + ", empDOJ=" + empDOJ + ", empDOB=" + empDOB + ", empSal=" + empSal
                + ", empMail=" + empMail + ", empPassword=" + empPassword + "]";
    }

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

    public EmployeeCode()

    {

        super();

    }
}