import { Injectable } from '@angular/core';
import { ExpenseClaimed } from '../model/expense-claimed';
import { Employee } from '../model/employee';
import { Project } from '../model/project';
import { Expense } from '../model/expense';
import { throwError, Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ClaimService {
  url1="http://localhost:8085/claimExpense/getEmployee/";
  employees: Employee[];
  employee: Employee;
  project: Project;
  expense: Expense;
  id: number;
  constructor(private http: HttpClient) {
  }

  getData() {
    this.http.get(this.url1+this.id).subscribe((data: Employee) => {this.employee = data;}, error => { alert('problem with service/url, Try again') });;
  }
  handleError(error) {
    console.log(error);
    return throwError(error);
  }

  getEmployees() {
    this.getData()
  }

  getEmployee(id: number) {
    this.id = id;
  }
  getEmployee1()  {
    this.getEmployees();
    return this.employee;
  }
}
