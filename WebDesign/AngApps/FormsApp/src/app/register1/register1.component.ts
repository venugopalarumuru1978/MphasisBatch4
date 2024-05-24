import { Component } from '@angular/core';
import {FormGroup, FormControl, Validators} from '@angular/forms'
@Component({
  selector: 'app-register1',
  templateUrl: './register1.component.html',
  styleUrls: ['./register1.component.css']
})
export class Register1Component {

  msg:string = "";

  regForm = new FormGroup({
    personName : new FormControl('Pavan', [Validators.required, Validators.minLength(5)]),
    gender : new FormControl('', [Validators.required]),
    location : new FormControl('', [Validators.required]),
    phonenumber : new FormControl('', [Validators.required, Validators.maxLength(10), Validators.minLength(10)]),
  });

  registerPerson():void
  {
    if(this.regForm.valid)
    {
          this.msg = "Person Name : " + this.regForm.controls.personName.value;
          this.msg += "<br />Gender : " + this.regForm.controls.gender.value;
          this.msg += "<br />Location : " + this.regForm.controls.location.value;
          this.msg += "<br />Phone Number : " + this.regForm.controls.phonenumber.value;
    }
    else
      alert("Invalid Form Submission")
  }

}
