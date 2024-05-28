import { Component } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-all-emp',
  templateUrl: './view-all-emp.component.html',
  styleUrls: ['./view-all-emp.component.css']
})
export class ViewAllEmpComponent {

  empinfo:Employee[] = [];
  username:any = "";
  constructor(private empServ:EmployeeService, private router:Router){
    if(sessionStorage.getItem("user")!=null)
    {
      this.username = sessionStorage.getItem("user");
      this.getempinfo();
    }
    else
    {
      alert("Please Login First");
      this.router.navigate(['/login']);
    }
  }

  getempinfo():void
  {
      this.empServ.ViewAllEmployees().subscribe(data=>{
        this.empinfo = data;
        console.log(data);
      });  
  }

  GetEmpOne(eno:number):void
  {
      this.router.navigate(['/empone', eno]);
  }

  GetUpdateOne(eno:number):void
  {
      this.router.navigate(['/modemp', eno]);
  }

  DelEmp(eno:any):void{
    if(confirm("Are u sure to delete employee")==true)
    {
      this.empServ.DeleteEmployeeBasedOnEmpno(eno).subscribe(data=>{
        this.getempinfo();      
      });
    }
  }
}
