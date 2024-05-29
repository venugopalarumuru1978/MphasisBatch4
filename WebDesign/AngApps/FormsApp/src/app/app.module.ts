import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PipesPageComponent } from './pipes-page/pipes-page.component';
import { LoginComponent } from './login/login.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { WelcomeComponent } from './welcome/welcome.component';
import { Register1Component } from './register1/register1.component';
import { Register2Component } from './register2/register2.component';
import {ReactiveFormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { ViewAllEmpsComponent } from './view-all-emps/view-all-emps.component';
import { EmpallComponent } from './empall/empall.component';
import { HttpClientModule } from '@angular/common/http';
import { AddempComponent } from './addemp/addemp.component';
import { ViewempComponent } from './viewemp/viewemp.component';
import { ModempComponent } from './modemp/modemp.component';
@NgModule({
  declarations: [
    AppComponent,
    PipesPageComponent,
    LoginComponent,
    WelcomeComponent,
    Register1Component,
    Register2Component,
    HomeComponent,
    ViewAllEmpsComponent,
    EmpallComponent,
    AddempComponent,
    ViewempComponent,
    ModempComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule, 
    FormsModule, 
    ReactiveFormsModule, 
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
