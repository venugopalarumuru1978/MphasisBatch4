import { Component } from '@angular/core';
import { FormBuilder,  Validators } from '@angular/forms';
@Component({
  selector: 'app-register2',
  templateUrl: './register2.component.html',
  styleUrls: ['./register2.component.css']
})
export class Register2Component {

  msg:string = "";
  constructor(private frmBuilder:FormBuilder){}


  regForm = this.frmBuilder.group({
    personName: this.frmBuilder.control('', Validators.required),
    gender: this.frmBuilder.control('', [Validators.required]),
    location: this.frmBuilder.control('', [Validators.required]),
    phonenumber: this.frmBuilder.control('', [Validators.required, Validators.minLength(10)]),
  });


  printDetails()
  {
    if(this.regForm.valid)
    {
      this.msg = "Person Name : " + this.regForm.value.personName;
      this.msg += "<br />Gender : " + this.regForm.value.gender;
      this.msg += "<br />Phone Number : " + this.regForm.value.phonenumber;
      this.msg += "<br />Location : " + this.regForm.value.location; 
    }
    else 
    alert("Invalid Form Submission")
  }
}
