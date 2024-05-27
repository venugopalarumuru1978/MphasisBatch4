import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent {

  username:any = "";

  constructor(private router:Router)
  {
      this.username = sessionStorage.getItem("uinfo");
  }
}
