import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { SaveProductsComponent } from './save-products/save-products.component';
import { MasterDataService } from '../../MasterDataService';

@Component({
  selector: 'app-profiles',
  templateUrl: './profiles.component.html',
  styleUrl: './profiles.component.scss'
})
export class ProfilesComponent implements OnInit {

  profileInfo: Array<{ id: any, name: any, description: any, imageLocation: any }> = [];


  constructor(private router: Router,
    private openDialog: MatDialog,
    private masterDataService: MasterDataService) {
  }

  ngOnInit(): void {
    this.masterDataService.getAccounts().subscribe((res) => {
      this.profileInfo = res;
    });
  }

  addProduct() {
    const dialogRef = this.openDialog.open(SaveProductsComponent, {
      width: '650px',
      data: null,
    });
  }

}
