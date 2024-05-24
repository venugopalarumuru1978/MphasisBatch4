import { Component } from '@angular/core';

@Component({
  selector: 'app-test2',
  templateUrl: './test2.component.html',
  styleUrls: ['./test2.component.css']
})
export class Test2Component {
    pname:string = "Venugopal";

    cities:string[] = ["Hyderabad", "Amaravathi", "Bangalore", "Kolkatta", "Mumbai"];
    
    age:number = 0;
    msg:string = "";
    flag:boolean = false;
    cssclass:string = "";
    country:string = "";
    
    testvoterage():void
    {
        if(this.age>=18)
        {
          this.msg = this.pname + " is eligible for Voting";
          this.flag = true;
          this.cssclass="getgreen";
        }  
        else
        {
          this.msg = this.pname + " is not eligible for Voting";
          this.flag = false;
          this.cssclass="getred";
        }
    }
}
