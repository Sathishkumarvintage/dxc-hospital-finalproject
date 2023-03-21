import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Doctor } from './user';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {
  private baseURL="http://localhost:8083/api/v1/doctors";
   
  
  constructor(private httpClient:HttpClient) { }


  getDoctorList():Observable<Doctor[]>
  {
    return this.httpClient.get<Doctor[]>(`${this.baseURL}`);
  }

createDoctor(user:Doctor):Observable<Object>{

  return this.httpClient.post(`${this.baseURL}`,user);
}

getDoctorById(doctorId:number):Observable<Doctor>
{
  return this.httpClient.get<Doctor>(`${this.baseURL}/${doctorId}`)
}

updateDoctor(doctorId:number,user:Doctor):Observable<Object>
{
  return this.httpClient.put(`${this.baseURL}`,user);
}

deleteDoctor(doctorId:number):Observable<Object>
{
  return this.httpClient.delete(`${this.baseURL}/${doctorId}`)
}

}
