import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cart, CartDTO } from './cart.model';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  constructor(private http: HttpClient) { }

  saveTocart(cart : Cart): Observable<any>{
    return this.http.post('http://localhost:8083/api/v1/cart/save', cart);
  }

  getAllCartItems(): Observable<CartDTO[]> {
    return this.http.get<CartDTO[]>('http://localhost:8083/api/v1/cart/cartWithProductDetails');
  }
}
