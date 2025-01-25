import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CartRoutingModule } from './cart-routing.module';
import { CartComponent } from './cart/cart.component';
import { MatCardModule } from '@angular/material/card';
import { SharedModuleModule } from '../../common/shared-module/shared-module.module';


@NgModule({
  declarations: [
    CartComponent
  ],
  imports: [
    CommonModule,
    CartRoutingModule,
    MatCardModule,
    SharedModuleModule
  ]
})
export class CartModule { }
