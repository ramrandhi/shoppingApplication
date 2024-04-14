import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


const headers = new HttpHeaders({
  'Content-Type': 'application/json',
});

const options = {
  headers: headers,
};

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(private http: HttpClient) { }

  getOtp(mobileNumber: string): Observable<any> {
    return this.http.get<any>(`http://localhost:8081/v1/otp/generate?mobileNumber=${mobileNumber}`);
  }

  registerUser(userInfo: any, otp: any): Observable<any> {
    return this.http.post<any>(`http://localhost:8081/v1/userInfo/register?otp=${otp}`, userInfo);
  }

}
