import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { SaveProductsComponent } from './save-products/save-products.component';

@Component({
  selector: 'app-profiles',
  templateUrl: './profiles.component.html',
  styleUrl: './profiles.component.scss'
})
export class ProfilesComponent implements OnInit {

  items: String[] = ['Your Orders', 'Login & Security', 'Your Address', 'Payment Options', 'Contact Us'];

  constructor(private router: Router,
    private openDialog: MatDialog) {

  }

  ngOnInit(): void {

  }

  addProduct() {
    const dialogRef = this.openDialog.open(SaveProductsComponent, {
      width: '650px',
      data: null,
    });
  }

}
