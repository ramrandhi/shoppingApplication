import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MobileServiceService {

  constructor(private http: HttpClient) { }

  getAllMobiles(): Observable<any> {
    return this.http.get('http://localhost:8082/v1/product/all');
  }

  getAllMobileBrands(mobileCompany: string): Observable<any> {
    return this.http.get(`http://localhost:8082/v1/product/company?company=${encodeURIComponent(mobileCompany)}`);
  }
  
}
