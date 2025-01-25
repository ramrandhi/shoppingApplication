import { Component, OnInit } from '@angular/core';
import { CartService } from '../cart.service';
import { ToastrService } from 'ngx-toastr';
import { Cart, CartDTO } from '../cart.model';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrl: './cart.component.scss'
})
export class CartComponent implements OnInit {
  selectedItems: number = 0;
  cartIemsLength: number = 0;
  currentCart: CartDTO[] = [];
  selectedItemsPrice: number = 0;
  constructor(private cartService: CartService, private toastService: ToastrService) {

  }

  ngOnInit(): void {
    this.currentCart = [];
    this.getAllCartItems();
  }

  getAllCartItems() {
    this.cartService.getAllCartItems().subscribe((res: CartDTO[]) => {
      if (res) {
        this.currentCart = res;
        this.cartIemsLength = this.currentCart.length;
        this.toastService.success('Cart Items Fetched Successfully', 'Cart Items');
      }
    }, (error) => {
      this.toastService.error('cart Data retrival Failure', 'Cart Data Failure');
    })
  };

  checkboxSelected(cart: any, event: Event): void {
    const isChecked = (event.target as HTMLInputElement).checked;

    if (isChecked) {
      this.selectedItems = this.selectedItems + 1;
      this.selectedItemsPrice = this.selectedItemsPrice + cart.price;
    } else {
      this.selectedItems = this.selectedItems - 1;
      this.selectedItemsPrice = this.selectedItemsPrice - cart.price;
    }
  }


}
