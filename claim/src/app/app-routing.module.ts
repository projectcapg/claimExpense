import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClaimComponent } from './claim/claim.component';
import { ProjectComponent } from './project/project.component';


const routes: Routes = [
  { path: '', component:ClaimComponent },
  { path: 'project', component:ProjectComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
