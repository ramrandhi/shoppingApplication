import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProfilesComponent } from './profiles.component';
import { SaveProductsComponent } from './save-products/save-products.component';

const routes: Routes = [
  { path: '', component: ProfilesComponent },
  { path: 'save-product', component: SaveProductsComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProfilesRoutingModule { }
