import { Component } from '@angular/core';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  username:string = "";
  pswd:string = "";
  msg:string = "";
  user_result:any=false;
  constructor(private loginServ:LoginService, private router:Router){
    sessionStorage.removeItem("user");
  }

  LoginCheck():void{
    
    this.loginServ.UserCheck(this.username, this.pswd).subscribe(data=>{
        this.user_result = data;
        console.log(this.user_result);
        if(this.user_result==true)
          {
            sessionStorage.setItem("user", this.username);
            this.router.navigate(['/viewall']);
          }
          else
          {
            this.msg = "Please check username / password";
          }
    });
  }

}
