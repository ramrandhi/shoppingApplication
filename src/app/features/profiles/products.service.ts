import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


const headers = new HttpHeaders({
  'Content-Type': 'application/json',
});

const options = {
  headers: headers,
}

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  constructor(private http: HttpClient) { }

  createProduct(productData: any): Observable<any> {
    return this.http.post('http://localhost:8082/v1/product/save', productData);
  }

}
