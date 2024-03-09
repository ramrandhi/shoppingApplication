import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent implements OnInit{
  constructor(
    private router: Router
  ){}

  ngOnInit(): void {
    console.log('geelo');
  }

  submitLoginInfo(){
    console.log("hello");
    this.router.navigateByUrl('/app/dashboard');
  }
}
