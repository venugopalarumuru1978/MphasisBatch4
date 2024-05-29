import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-all-emps',
  templateUrl: './view-all-emps.component.html',
  styleUrls: ['./view-all-emps.component.css']
})
export class ViewAllEmpsComponent {

  constructor(private empServ:EmployeeService, private router:Router){
    this.getempInfo();
  }

  empInfo:Employee[] = [];

  getempInfo()
  {
    this.empServ.getAllEmps().subscribe(data=>{
      //alert(data);
        this.empInfo = data;
        console.log(this.empInfo);
    });
  }

  getOneEmp(eno:any):void
  {
      this.router.navigate(['/oneemp', eno]);
  }
}
