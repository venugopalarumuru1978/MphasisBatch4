import { Component } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-modemp',
  templateUrl: './modemp.component.html',
  styleUrls: ['./modemp.component.css']
})
export class ModempComponent {

  empno:any = 0;
  emp:Employee = new Employee(0, "", "", 0.0);

  constructor(private empServ:EmployeeService, 
    private aroute:ActivatedRoute, private router:Router )
    {
        this.empno = this.aroute.snapshot.params['id'];
        this.empServ.getEmpBasedOnEmpNo(this.empno).subscribe(data=>{
            this.emp = data;
            console.log(data);
        });
    }

    modEmp():void
    {
      this.empServ.ModifyEmpBasedOnEmpNo(this.empno, this.emp).subscribe(data=>{
        this.router.navigate(['/allempinfo']);
      });
    }
}
