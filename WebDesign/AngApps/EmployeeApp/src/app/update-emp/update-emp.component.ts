import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../employee';

@Component({
  selector: 'app-update-emp',
  templateUrl: './update-emp.component.html',
  styleUrls: ['./update-emp.component.css']
})
export class UpdateEmpComponent {

  emp:Employee = new Employee(0, "", "", "");
  empno:any = 0;
  username:any ="";
  
  constructor(private empServ:EmployeeService, 
    private aroute:ActivatedRoute, 
    private router:Router)
    {
      if(sessionStorage.getItem("user")!=null)
      {
        this.username = sessionStorage.getItem("user");
        this.empno = this.aroute.snapshot.params["id"];
        this.getEmpInfo();
      }
      else
      {
        alert("Please Login First");
        this.router.navigate(['/login']);
      }
      
    }

  getEmpInfo():void
  {
    this.empServ.GetSingleEmpInfo(this.empno).subscribe(data=>{
      this.emp = data;
    });
  }

  UpdateEmp():void{

    this.empServ.UpdateEmpBasedOnEmpno(this.empno, this.emp).subscribe(data=>{
        this.router.navigate(['/viewall']);
    });
  }

}
