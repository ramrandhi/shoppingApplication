import { Component, OnInit } from '@angular/core';
import { MobileServiceService } from './mobile-service.service';
import { groupBy, mergeMap, toArray } from 'rxjs';
import { Mobile } from './mobileProperties';

interface MobileProperties {
  [key: string]: Mobile[];
}

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrl: './mobiles.component.scss'
})
export class MobilesComponent implements OnInit {

  mobiles: Array<{
    name: any, brand: any, model: any, color: any, description: any, oldPrice: any, price: any,
    stockQuantity: any, createdAt: any, updatedAt: any, category: any, imageLocation: any, id: any
  }> = [];

  rating: number = 4;

  mobileProperties: MobileProperties = {};
  mobileBrands: string[] = [];
  mobileCompany: string = 'mobile';


  constructor(private mobileService: MobileServiceService) {
  }
  ngOnInit(): void {
    this.getAllMobiles();
    this.getAllMobileBrands();
  }
  onMobileSelection() {

  }

  getAllMobileBrands() {
    this.mobileService.getAllMobileBrands(this.mobileCompany).subscribe((res) => {
      this.mobileBrands = res;
      console.log(this.mobileBrands);
    });
  }

  getAllMobiles() {
    this.mobileService.getAllMobiles().subscribe((res) => {
      // res.forEach((mobile: Mobile) => {
      //   if (!this.mobileProperties[mobile.company]) {
      //     this.mobileProperties[mobile.company] = [];
      //   }
      //   this.mobileProperties[mobile.company].push(mobile);
      // });
      this.mobiles = res;
      console.log(this.mobiles);
    });
  }

  // getMobilePropertiesKeys(): string[] {
  //   return Object.keys(this.mobileProperties);
  // }

}
