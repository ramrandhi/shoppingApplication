import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  userName: string = '';

  constructor(
    private router: Router,
    private fb: FormBuilder
  ) {
  }

  ngOnInit(): void {
  }

  onContinueButtonClicked() {
    this.router.navigateByUrl(`/login-password?userName=${this.userName}`);
  }

  submitLoginInfo() {
    this.router.navigateByUrl('/app/dashboard');
  }

  redirectToRegistrationPage() {
    this.router.navigateByUrl('/register');
  }
}
