import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { PipesPageComponent } from './pipes-page/pipes-page.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { Register1Component } from './register1/register1.component';
import { Register2Component } from './register2/register2.component';
import { HomeComponent } from './home/home.component';
import { loginGuard } from './login.guard';
import { ViewAllEmpsComponent } from './view-all-emps/view-all-emps.component';
import { EmpallComponent } from './empall/empall.component';
import { AddempComponent } from './addemp/addemp.component';
import { ViewempComponent } from './viewemp/viewemp.component';
import { ModempComponent } from './modemp/modemp.component';

const routes: Routes = [
  {path:"", component:HomeComponent},
  {path:"login", component:LoginComponent},
  {path:"home", component:HomeComponent},
  {path:"pips", component:PipesPageComponent},
  {path:"welcome", component:WelcomeComponent, canActivate:[loginGuard]},
  {path:"reg1", component:Register1Component},
  {path:"reg2", component:Register2Component},
  {path:"allempinfo", component:ViewAllEmpsComponent,canActivate:[loginGuard]},
  {path:"allemp", component:EmpallComponent,canActivate:[loginGuard]},
  {path:"empreg", component:AddempComponent,canActivate:[loginGuard]},
  {path:"oneemp/:id", component:ViewempComponent,canActivate:[loginGuard]},
  {path:"modemp/:id", component:ModempComponent,canActivate:[loginGuard]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
