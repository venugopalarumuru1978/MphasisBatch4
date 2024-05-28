import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmpAddComponent } from './emp-add/emp-add.component';
import { ViewAllEmpComponent } from './view-all-emp/view-all-emp.component';
import { EmpOneComponent } from './emp-one/emp-one.component';
import { UpdateEmpComponent } from './update-emp/update-emp.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path:"", component:LoginComponent},
  {path:"login", component:LoginComponent},
  {path:"empadd", component:EmpAddComponent},
  {path:"viewall", component:ViewAllEmpComponent},
  {path:"empone/:id", component:EmpOneComponent},
  {path:"modemp/:id", component:UpdateEmpComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
