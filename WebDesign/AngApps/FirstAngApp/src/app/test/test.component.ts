import { Component } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent {
       pname:string = "Sahasra";
       age:number = 15;
       location:string = "Hyderabad";
       url:string = "http://www.google.com/";

       getinfo():void
       {
          this.pname = "Pravasthi";
          this.age = 12;
          this.location = "Nellore";
       }
}
