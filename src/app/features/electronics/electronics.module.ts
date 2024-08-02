import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ElectronicsRoutingModule } from './electronics-routing.module';
import { MobilesComponent } from './mobiles/mobiles.component';
import { MatCardModule } from '@angular/material/card';
import { ElectronicsComponent } from './electronics.component';
import { SharedModuleModule } from '../../common/shared-module/shared-module.module';

@NgModule({
  declarations: [
    MobilesComponent,
    ElectronicsComponent,
  ],
  imports: [
    CommonModule,
    ElectronicsRoutingModule,
    MatCardModule,
    SharedModuleModule
  ]
})
export class ElectronicsModule { }
