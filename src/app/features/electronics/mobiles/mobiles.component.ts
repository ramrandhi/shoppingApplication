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

  mobileProperties: MobileProperties = {};
  mobileBrands: string[] = [];
  mobileCompany:string = 'mobile';


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
    })
  }

  getAllMobiles() {
    this.mobileService.getAllMobiles().subscribe((res) => {
      res.forEach((mobile : any) => {
        if (!this.mobileProperties[mobile.company]) {
          this.mobileProperties[mobile.company] = [];
        }
        this.mobileProperties[mobile.company].push(mobile);
      });
      console.log(this.mobileProperties);
    });
  }


}
