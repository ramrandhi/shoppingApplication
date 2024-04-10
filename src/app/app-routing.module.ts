import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './auth/login/login.component';
import { RegisterComponent } from './auth/register/register.component';
import { VerifyRegisterComponent } from './auth/verify-register/verify-register.component';
import { LoginPasswordComponent } from './auth/login-password/login-password.component';

export const routes: Routes = [ 
  {path: '', redirectTo: '/login', pathMatch:'full' },
  {path: 'login', component: LoginComponent},
  { path: 'login-password', component: LoginPasswordComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'verify-register', component: VerifyRegisterComponent },
  { path: 'app', loadChildren: () => import('./features/features.module').then(m => m.FeaturesModule)},
  { path: '', redirectTo: 'app', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
