import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './auth/login/login.component';

export const routes: Routes = [
  {path: '', redirectTo: '/login', pathMatch:'full' },
  {path: 'login', component: LoginComponent},
  { path: 'app', loadChildren: () => import('./features/features.module').then(m => m.FeaturesModule)}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
