import { Injectable } from '@angular/core';
import { Employee } from './employee';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private httpClient:HttpClient){
  }

  private apiURL = "http://localhost:9090/api/v1/employees";

  ViewAllEmployees():Observable<Employee[]>
  {
    return this.httpClient.get<Employee[]>(`${this.apiURL}`);
  }

  AddNewEmployee(emp:Employee):Observable<Employee>
  {
      return this.httpClient.post<Employee>(`${this.apiURL}`, emp);
  }

  GetSingleEmpInfo(eno:any):Observable<Employee>
  {
    return this.httpClient.get<Employee>(`${this.apiURL}/${eno}`);
  }

  DeleteEmployeeBasedOnEmpno(eno:any):Observable<Object>
  {
    return this.httpClient.delete(`${this.apiURL}/${eno}`);
  }

  UpdateEmpBasedOnEmpno(eno:any, emp:Employee):Observable<Object>
  {
    return this.httpClient.put(`${this.apiURL}/${eno}`, emp);
  }
}
