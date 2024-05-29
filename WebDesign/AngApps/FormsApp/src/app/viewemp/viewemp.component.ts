import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../employee';

@Component({
  selector: 'app-viewemp',
  templateUrl: './viewemp.component.html',
  styleUrls: ['./viewemp.component.css']
})
export class ViewempComponent {

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

    deleteEmp(eno:any):void
    {
      if(confirm("Are u sure to delete emp")==true)
      {
        this.empServ.DeleteEmpBasedOnEmpNo(eno).subscribe(data=>{
          this.router.navigate(['/allempinfo']);
        });
      }
    }

    getModEmp(eno:any):void
    {
        this.router.navigate(['/modemp', eno]);
    }

    
}
