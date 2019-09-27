import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClaimComponent } from './claim/claim.component';
import { ProjectComponent } from './project/project.component';
import { ExpenseComponent } from './expense/expense.component';
import { AddclaimComponent } from './addclaim/addclaim.component';


const routes: Routes = [
  { path: '', component:ClaimComponent },
  { path: 'project', component:ProjectComponent },
  { path: 'Expense', component:ExpenseComponent },
  { path: 'Claim', component:AddclaimComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
