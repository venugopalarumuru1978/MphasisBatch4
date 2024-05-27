import { Component, DoCheck } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  username:string = "";
  pwd:string = "";
  msg:string = "";

  constructor(private router:Router, private loginService:LoginService){
      sessionStorage.removeItem("uinfo");
  }

  
  usercheck(frm:any):void
  {
    if(frm.valid)
    {
      //if(this.username =="Venugopal" && this.pwd == "v@123")
      if(this.loginService.LoginUserCheck(this.username, this.pwd)==true)
      {
        sessionStorage.setItem("uinfo", this.username);
        //this.msg = "user details are correct";
        this.router.navigate(['/welcome']);
      }
      else
        this.msg = "invalid user details";
    }
    else
      //this.msg = "Invalid Form";
      alert("Invalid Form");
  }

}
