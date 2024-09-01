import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Cart } from './cart/cart';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  constructor(private http: HttpClient) { }

  saveTocart(cart : Cart): Observable<any>{
    return this.http.post('http://localhost:8083/api/v1/order/save', cart);
  }
}
