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

  
}
