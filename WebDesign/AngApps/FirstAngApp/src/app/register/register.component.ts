import { Component } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  pname:string = "";
  gender:string = "Male";
  location:string = "";
  isGraduate:boolean = false;

  msg:string = "";
  cssclass:string = "";

  printData():void
  {
      this.msg = "";
      this.msg += this.pname + "<br />";
      this.msg += this.gender + "<br />";
      if(this.isGraduate==true){
        this.msg += "Graduated...<br />";
        this.cssclass="getgreen";  // getgreen, getred are css classnames
      }
      else{
        this.msg += "Not Graduated...<br />";
        this.cssclass="getred";
      }
      
      this.msg += this.location;
  }
}
