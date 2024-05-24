import { Component } from '@angular/core';
import { Student } from '../student';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  stdinfo:Student[] = [
    new Student(101, "Pavan", "java", 15000.00),
    new Student(102, "Kavan", "java", 15000.00),
    new Student(103, "Lavan", "java", 15000.00),
    new Student(104, "Gavan", "java", 15000.00),
    new Student(105, "Bavan", "java", 15000.00),
  ]

  std : Student = new Student(0, "", "", 0.0);
  
  addnewStudent():void
  {
    this.stdinfo.push(new Student(this.std.rollno, this.std.sname, this.std.course, this.std.fees));
    this.std.rollno = 0;
    this.std.sname = "";
    this.std.course = "";
    this.std.fees = 0.0;  
  }

  removeStudent(i:number):void
  {
    this.stdinfo.splice(i,1);
  }
}
