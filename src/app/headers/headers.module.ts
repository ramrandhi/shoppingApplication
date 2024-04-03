import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HeadersRoutingModule } from './headers-routing.module';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { SideNavBarComponent } from './side-nav-bar/side-nav-bar.component';


@NgModule({
  declarations: [
    SideNavBarComponent
  ],
  imports: [
    CommonModule,
    HeadersRoutingModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
  ]
})
export class HeadersModule { }
