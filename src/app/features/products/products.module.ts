import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProductsRoutingModule } from './products-routing.module';
import { MobilesComponent } from './mobiles/mobiles.component';
import { PensComponent } from './pens/pens.component';
import { PencilsComponent } from './pencils/pencils.component';
import { ChairsComponent } from './chairs/chairs.component';
import { ProductsComponent } from './products.component';


@NgModule({
  declarations: [
    MobilesComponent,
    PensComponent,
    PencilsComponent,
    ChairsComponent,
    ProductsComponent
  ],
  imports: [
    CommonModule,
    ProductsRoutingModule
  ]
})
export class ProductsModule { }
