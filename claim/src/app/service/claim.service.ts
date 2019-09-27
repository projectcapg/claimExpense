import { Injectable } from '@angular/core';
import { ExpenseClaimed } from '../model/expense-claimed';
import { Employee } from '../model/employee';
import { Project } from '../model/project';
import { Expense } from '../model/expense';
import { throwError, Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { retry,  catchError, share} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ClaimService {
  url1="http://localhost:8085/claimExpense/getEmployee/";
  url2="http://localhost:8085/claimExpense/getAllProjects";
  url3="http://localhost:8085/claimExpense/getAllExpenses";
  url4="http://localhost:8085/claimExpense/AddClaim"
  employees: Employee[];
  public employee$ = new Observable<Employee>();
  public project$ = new Observable<Project[]>();
  public expense$ = new Observable<Expense[]>();
  employee: Employee = {empId:0, empName: '', empPAN: '', empDesg: '', empDomain: '', empDOJ: null, empDOB: null, empSal: 0, empMail: '', empPassword: ''};
  project: Project = {id: 0, name: '', description: '', startDate: null, endDate: null, businessUnit: ''};
  expense: Expense = {expenseCode: 0, expenseType: '', expenseDescription: ''};
  id: number;
  constructor(private http: HttpClient) {
  }

  getData() {
    this.employee$ = this.http.get<Employee>(this.url1 + this.id).pipe(share(),retry(2), catchError(this.handleError));
  }
  handleError(error) {
    console.log(error);
    return throwError(error);
  }

  getEmployee(id: number) {
    this.id = id;
    this.getData();
    return this.employee$;
  }

  getData1()  {
    this.project$ = this.http.get<Project[]>(this.url2).pipe(share(),retry(2), catchError(this.handleError));
  }

  getProject() {
    this.getData1();
    return this.project$;
  }

  getData2()  {
    this.expense$ = this.http.get<Expense[]>(this.url3).pipe(share(),retry(2), catchError(this.handleError));
  }

  getExpense() {
    this.getData2();
    return this.expense$;
  }
  AddClaim(claim: ExpenseClaimed): Observable<Object> {  
    return this.http.post(this.url4, claim); 
  } 
}
