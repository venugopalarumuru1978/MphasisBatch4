import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';

@Component({
  selector: 'app-pipes-page',
  templateUrl: './pipes-page.component.html',
  styleUrls: ['./pipes-page.component.css']
})
export class PipesPageComponent {
 
  empname:string = "Praveen Kumar";
  salary:number = 40000.00;
  dt = new Date();
  empaddress = {"dno":"D.No. 1-121/A", "loc":"Hyderabad"};
  cent:number = 0.3;
  n:number = 10000;

  constructor(private emp:EmployeeService){}


}
