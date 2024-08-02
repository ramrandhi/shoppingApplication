import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Injectable({
    providedIn: 'root'
  })
  export class MasterDataService {
    constructor(private http: HttpClient) { }
  
    getAllCountries() {
      return this.http.get<any>('http://localhost:8081/v1/masterData/countries');
    }

    getAccounts() {
      return this.http.get<any>('http://localhost:8081/v1/masterData/account');
    }
  }