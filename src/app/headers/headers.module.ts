import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HeadersRoutingModule } from './headers-routing.module';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { SideNavComponent } from './side-nav/side-nav.component';
import { SubHeaderComponent } from './sub-header/sub-header.component';


@NgModule({
  declarations: [
    SideNavComponent,
  ],
  imports: [
    CommonModule,
    HeadersRoutingModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
  ],
  exports: [SideNavComponent]
})
export class HeadersModule { }
