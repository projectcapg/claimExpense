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
  url2="http://localhost:8085/claimExpense/getProject/";
  employees: Employee[];
  public employee$ = new Observable<Employee>();
  public project$ = new Observable<Project>();
  project: Project;
  expense: Expense;
  id: number;
  id1: number;
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
    this.project$ = this.http.get<Project>(this.url2 + this.id1).pipe(share(),retry(2), catchError(this.handleError));
  }

  getProject(id1: number) {
    this.id1 = id1;
    this.getData1();
    return this.project$;
  }
}
