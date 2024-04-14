import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const headers = new HttpHeaders({
  'Content-Type': 'application/json',
});

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }

  // verifyUserName(userName: string):Observable<any>{
  //   let params: HttpParams = new HttpParams();
  //   params = params.set('userName', userName);
  //   let headers: HttpHeaders = new HttpHeaders();
  //   headers = headers.set('Content-Type', 'application/json');
  //   return this.http.get<any>('http://localhost:8081/v1/userInfo', { params: params, headers : headers })
  // }
  verifyUserName(userName: string): Observable<any> {
    return this.http.get<any>(`http://localhost:8081/v1/userInfo/login-username-check?userName=${userName}`, { headers: headers });
  }

  verifySignIn(userName: string, password: string) {
    return this.http.get<any>(`http://localhost:8081/v1/userInfo/verify-signin?userName=${userName}&password=${password}`, { headers: headers });
  }
}
