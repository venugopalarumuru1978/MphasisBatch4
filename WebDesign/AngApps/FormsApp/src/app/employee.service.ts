import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private httpClient:HttpClient) { }

  private apiUrl = "http://localhost:8000/Employee";


  getAllEmps():Observable<Employee[]>
  {
      return this.httpClient.get<Employee[]>(`${this.apiUrl}`);
  }


  


}
