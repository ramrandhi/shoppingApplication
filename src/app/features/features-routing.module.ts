// features-routing.module.ts
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { FeaturesComponent } from './features.component';

const routes: Routes = [
  {
    path: '',
    component: FeaturesComponent,
    children: [
      {
        path: 'dashboard',
        loadChildren: () => import('./dashboard/dashboard.module').then((m) => m.DashboardModule),
      },
      { path: 'profile', loadChildren: () => import('./profiles/profiles.module').then(m => m.ProfilesModule) },
      { path: 'electronics', loadChildren: () => import('./electronics/electronics.module').then(m => m.ElectronicsModule) },
      {
        path: 'cart',
        loadChildren: () => import('./cart/cart.module').then((m) => m.CartModule),
      },
      {
        path: 'order',
        loadChildren: () => import('./orders/orders.module').then((m) => m.OrdersModule),
      }
    ],
  },
];

@NgModule({
  imports: [CommonModule, RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class FeaturesRoutingModule { }
