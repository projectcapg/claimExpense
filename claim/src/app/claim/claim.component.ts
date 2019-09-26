import { Component, OnInit } from '@angular/core';
import { ExpenseClaimed } from '../model/expense-claimed';
import { ClaimService } from '../service/claim.service';
import { Employee } from '../model/employee';

@Component({
  selector: 'app-claim',
  templateUrl: './claim.component.html',
  styleUrls: ['./claim.component.css']
})
export class ClaimComponent implements OnInit {
  claim: ExpenseClaimed = {expenseCodeId:0,employeeId:0,projectCode:0, expenseCode:0,startDate: null, endDate: null,expenseAmount:0};
  employee: Employee = {empId:0, empName: '', empPAN: '', empDesg: '', empDomain: '', empDOJ: null, empDOB: null, empSal: 0, empMail: '', empPassword: ''};
  emp: number;
  emp1: number;
  constructor(private service: ClaimService) { }

  ngOnInit() {
  }
  searchEmployee()  {
    console.log(this.emp);
    this.service.getEmployee(this.emp);
    this.getEmployee();
  }
  getEmployee() {
    this.employee = this.service.getEmployee1();
    console.log(this.employee);
  }
}
