import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrl: './cart.component.scss'
})
export class CartComponent implements OnInit{
  selectedItems:number = 0;

  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

}
