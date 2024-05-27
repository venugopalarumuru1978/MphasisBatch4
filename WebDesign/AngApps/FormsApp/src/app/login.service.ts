import { Injectable } from '@angular/core';
import { Users } from './users';
@Injectable({
  providedIn: 'root'
})
export class LoginService {

userinfo:Users[] = [
  new Users("Pavan", "p@123"),
  new Users("Gokul", "g@123"),
  new Users("Murali", "m@123"),
  new Users("Sravan", "s@123"),
  new Users("Pavani", "pi@123")
]

  constructor() { }

  LoginUserCheck(user:string, pwd:string):boolean
  {
    var uchk = false;

      for(let i=0;i<this.userinfo.length;i++)
      {
        if(this.userinfo[i].username == user && this.userinfo[i].pswd == pwd)
        {
          uchk = true;
          break;
        }
      }

    return uchk;
  }

  checkUserExistInSession():boolean
  {
    if(sessionStorage.getItem("uinfo")!=null)
      return true;

    return false;
  }

}
