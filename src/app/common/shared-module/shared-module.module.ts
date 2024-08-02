import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RupeePipe } from '../currencyFormat/rupee.pipe';



@NgModule({
  declarations: [RupeePipe],
  imports: [CommonModule],
  exports: [RupeePipe]
})
export class SharedModuleModule { }
