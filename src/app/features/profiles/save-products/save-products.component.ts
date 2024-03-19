import { Component, OnInit } from '@angular/core';
import { Product } from './product';
import { MatDialog } from '@angular/material/dialog';
import { ProductsService } from '../products.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-save-products',
  templateUrl: './save-products.component.html',
  styleUrl: './save-products.component.scss'
})
export class SaveProductsComponent implements OnInit {
  productForm!: FormGroup;
  product: Product = new Product();
  products: Product[] = [];
  category: string[] = ['mobile', 'pencil', 'pen', 'laptop', 'mixer', 'grinder'];
  brand: string[] = ['Apple', 'Nokia', 'Micromax', 'laptop', 'OnePlus', 'Samsung'];
  constructor(private productService: ProductsService,
    private openDialog: MatDialog,
    private fb: FormBuilder) { }

  ngOnInit(): void {
    this.productForm = this.fb.group({
      company: ['', Validators.required],
      model: ['', Validators.required],
      description: [''],
      price: ['', Validators.required],
      stockQuantity: ['', Validators.required],
      category: ['', Validators.required]
    });
  }

  saveProductData(data: Product) {
    if (this.productForm.valid) {
      this.productService.createProduct(data).subscribe(
        (response) => {
          console.log(response);
        },
        (error) => {
          console.error(error);
        }
      );
    }
  }
  closeDialog() {
    this.openDialog.closeAll();
  }


}
