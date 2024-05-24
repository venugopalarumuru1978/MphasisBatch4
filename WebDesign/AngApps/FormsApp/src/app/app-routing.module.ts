import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { PipesPageComponent } from './pipes-page/pipes-page.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { Register1Component } from './register1/register1.component';
import { Register2Component } from './register2/register2.component';

const routes: Routes = [
  {path:"", component:LoginComponent},
  {path:"login", component:LoginComponent},
  {path:"pips", component:PipesPageComponent},
  {path:"welcome", component:WelcomeComponent},
  {path:"reg1", component:Register1Component},
  {path:"reg2", component:Register2Component},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
