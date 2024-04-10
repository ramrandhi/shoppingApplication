import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-password',
  templateUrl: './login-password.component.html',
  styleUrl: './login-password.component.scss'
})
export class LoginPasswordComponent implements OnInit {

  constructor(private router: Router) { }
  ngOnInit(): void { }

  onsignInButtonClicked() {
    this.router.navigateByUrl('/app/dashboard');
  }

  optService() {

  }

}
