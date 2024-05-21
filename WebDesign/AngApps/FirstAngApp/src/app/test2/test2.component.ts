import { Component } from '@angular/core';

@Component({
  selector: 'app-test2',
  templateUrl: './test2.component.html',
  styleUrls: ['./test2.component.css']
})
export class Test2Component {
    pname:string = "Venugopal";

    cities:string[] = ["Hyderabad", "Amaravathi", "Bangalore", "Kolkatta", "Mumbai"];
}
