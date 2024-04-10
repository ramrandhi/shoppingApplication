import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent implements OnInit{

  constructor(private router: Router){

  }

  ngOnInit(): void {
    
  }

  navigateToLogin(){
    this.router.navigateByUrl("/login")
  }
  verifyOtp(){
    this.router.navigateByUrl('/verify-register');
  }
  

}
