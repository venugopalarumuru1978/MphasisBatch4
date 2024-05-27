import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';

@Component({
  selector: 'app-empall',
  templateUrl: './empall.component.html',
  styleUrls: ['./empall.component.css']
})
export class EmpallComponent {

  empinfo:Employee[] = [];
  constructor(private empServ:EmployeeService){
      this.ShowAllEmps();
  }

  ShowAllEmps()
  {
    this.empServ.getAllEmps().subscribe(data=>{
      console.log(data);
      this.empinfo = data;
    });
  }
}
