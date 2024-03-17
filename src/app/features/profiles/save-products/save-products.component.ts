import { Component, OnInit } from '@angular/core';
import { Product } from './product';
import { MatDialog } from '@angular/material/dialog';
import { ProductsService } from '../products.service';

@Component({
  selector: 'app-save-products',
  templateUrl: './save-products.component.html',
  styleUrl: './save-products.component.scss'
})
export class SaveProductsComponent implements OnInit {
  product: Product = new Product();
  products: Product[] = [];
  category: string[] = ['mobile', 'pencil', 'pen', 'laptop', 'mixer', 'grinder'];
  brand: string[] = ['Apple', 'Nokia', 'Micromax', 'laptop', 'OnePlus', 'Samsung'];
  constructor(private productService: ProductsService,
    private openDialog: MatDialog) { }

  ngOnInit(): void {

  }

  saveProductData(data: Product) {
    this.productService.createProduct(data).subscribe(
      (response) => {
        console.log(response);
      },
      (error) => {
        console.error(error);
      }
    );
  }
  closeDialog() {
    this.openDialog.closeAll();
  }


}
