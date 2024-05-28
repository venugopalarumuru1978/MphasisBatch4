import { Component } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addemp',
  templateUrl: './addemp.component.html',
  styleUrls: ['./addemp.component.css']
})
export class AddempComponent {
  empObj:Employee = new Employee(0, "","", 0.0);

  constructor(private empServ:EmployeeService, private router:Router){

  }
  AddnewEmployee():void
  {
     // console.log(this.empObj.id);
     // console.log(this.empObj.ename);
     // console.log(this.empObj.job);
     // console.log(this.empObj.salary);
     this.empServ.newEmployee(this.empObj).subscribe(data=>{
      //alert("Employee is Added...")
      console.log(data);
      this.router.navigate(['/allempinfo'])
     });
  }
}
