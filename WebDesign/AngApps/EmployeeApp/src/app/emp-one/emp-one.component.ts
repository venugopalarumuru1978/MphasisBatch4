import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../employee';

@Component({
  selector: 'app-emp-one',
  templateUrl: './emp-one.component.html',
  styleUrls: ['./emp-one.component.css']
})
export class EmpOneComponent {

  empno:any =0;
  emp:Employee = new Employee(0, "", "", "");
  username:any = "";
  constructor(private empServ:EmployeeService, private aroute:ActivatedRoute, private router:Router){
    if(sessionStorage.getItem("user")!=null)
    {
      this.username = sessionStorage.getItem("user");
      this.getValueFromUrl();
      this.getEmpInfo();        
    }
    else
    {
      alert("Please Login First");
      this.router.navigate(['/login']);
    }
  }

  getValueFromUrl():void
  {
      console.log(this.aroute.snapshot.url);
      this.empno = this.aroute.snapshot.params["id"];
  }

  getEmpInfo()
  {
    this.empServ.GetSingleEmpInfo(this.empno).subscribe(data=>{
      this.emp = data;
      console.log(data);
    });
  }
}
