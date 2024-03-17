import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SuperHeadersRoutingModule } from './super-headers-routing.module';
import { SuperHeadersComponent } from './super-headers.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatMenuModule } from '@angular/material/menu';

@NgModule({
  declarations: [
    SuperHeadersComponent
  ],
  imports: [
    CommonModule,
    SuperHeadersRoutingModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    MatMenuModule,
  ],
  exports: [SuperHeadersComponent],
})
export class SuperHeadersModule { }
