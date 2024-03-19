import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SubHeaderRoutingModule } from './sub-header-routing.module';
import { SubHeaderComponent } from './sub-header.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatMenuModule } from '@angular/material/menu';


@NgModule({
  declarations: [
    SubHeaderComponent
  ],
  imports: [
    CommonModule,
    SubHeaderRoutingModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    MatMenuModule,

  ],
  exports: [SubHeaderComponent]
})
export class SubHeaderModule { }
