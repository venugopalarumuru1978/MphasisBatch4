import { Component, DoCheck } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements DoCheck {
  title = 'FormsApp';
  homeNav:boolean = true;
  userNav:boolean = false;

  constructor(private router:Router){}

  ngDoCheck(): void {
    let url = this.router.url;
    console.log(this.router.url);

    // if(url=="/welcome" || url=="/empnew"  || url=="/viewemps")
    if(url=="/welcome" || url=="/allempinfo" ||  url=="/empreg" ||  url.substring(0, 7)=="/oneemp" ||  url.substring(0, 7)=="/modemp")
    {
      this.homeNav = false;
      this.userNav = true;
    }
    else
    {
      this.homeNav = true;
      this.userNav = false;
    }
  }
}
