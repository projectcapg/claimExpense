import { Component, OnInit } from '@angular/core';
import { Project } from '../model/project';
import { Observable } from 'rxjs';
import { ClaimService } from '../service/claim.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.css']
})
export class ProjectComponent implements OnInit {

  project: Project = {id: 0, name: '', description: '', startDate: null, endDate: null, businessUnit: ''};
  flag: boolean=false;
  projectNum = 0;
  public pro$ = new Observable<Project>();
  constructor(private service: ClaimService, private router: Router) { }

  ngOnInit() {
  }

  searchProject() {
    this.project = {id: 0, name: '', description: '', startDate: null, endDate: null, businessUnit: ''};
    this.flag = false;
    this.pro$ = this.service.getProject(this.projectNum);
    this.pro$.subscribe((data: Project) => {
      this.project = data;
      if(this.project){
        this.flag=true;
      }
      else{
        this.flag=false;
      }
    }, error => { alert('No Data by this Id') });
  }
  searchExpense() {
    this.router.navigate(['Expense']);
  }
}
