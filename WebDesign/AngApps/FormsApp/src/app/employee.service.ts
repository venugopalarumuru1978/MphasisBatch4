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

  newEmployee(emp:Employee):Observable<Employee>
  {
    return this.httpClient.post<Employee>(`${this.apiUrl}`,emp);
  }
  
  getEmpBasedOnEmpNo(eno:any):Observable<Employee>
  {
    return this.httpClient.get<Employee>(`${this.apiUrl}/${eno}`);
  }

  DeleteEmpBasedOnEmpNo(eno:any):Observable<Object>
  {
    return this.httpClient.delete(`${this.apiUrl}/${eno}`);
  }

  ModifyEmpBasedOnEmpNo(eno:any, emp:Employee):Observable<Object>
  {
    return this.httpClient.put(`${this.apiUrl}/${eno}`, emp);
  }

}
