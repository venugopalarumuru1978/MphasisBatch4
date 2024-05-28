import { Component } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-emp-add',
  templateUrl: './emp-add.component.html',
  styleUrls: ['./emp-add.component.css']
})
export class EmpAddComponent {

  empObj:Employee = new Employee(0,"","","");
  username:any = "";
  constructor(private empServ:EmployeeService, private router:Router){
    if(sessionStorage.getItem("user")!=null)
    {
      this.username = sessionStorage.getItem("user");
    }
    else
    {
      alert("Please Login First");
      this.router.navigate(['/login']);
    }
  }

  AddNewEmp():void
  {
    this.empServ.AddNewEmployee(this.empObj).subscribe(data=>{
      //alert("emp added...")
      this.router.navigate(['/viewall']);
    });
  }

}
