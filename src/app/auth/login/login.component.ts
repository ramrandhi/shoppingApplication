import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from './login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  userName: string = '';
  showHideUserNamePage: boolean = true;
  showHidePasswordPage: boolean = false;
  isUserNameValid: boolean = true;
  password: string = '';
  isSignInFailed: boolean = false;

  constructor(
    private router: Router,
    private fb: FormBuilder,
    private loginService: LoginService,
  ) {
  }

  ngOnInit(): void {
  }

  validateInput(): boolean {
    const trimmedValue = this.userName.trim();
    if (trimmedValue === '') {
      return false;
    }
    const isValidEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(trimmedValue);
    const isValidPhoneNumber = /^[0-9]{10}$/.test(trimmedValue);
    return isValidEmail || isValidPhoneNumber;
  };


  onContinueButtonClicked() {
    if (this.isUserNameValid === false) {
      console.log("UserName Invalid")
    } else {
      this.showHideUserNamePage = false;
      this.showHidePasswordPage = true;
    }

  }

  submitLoginInfo() {
    this.router.navigateByUrl('/app/dashboard');
  }

  redirectToRegistrationPage() {
    this.router.navigateByUrl('/register');
  }

  onPasswordChange(value: string) {
    this.password = value;
    console.log(this.password);
  }

  onsignInButtonClicked() {
    this.loginService.verifySignIn(this.userName, this.password).subscribe((res) => {
      if (res === true) {
        this.isSignInFailed = false;
        this.router.navigateByUrl('/app/dashboard');
      } else {
        this.isSignInFailed = true;
      }
    })
  }

  onchangeButtonClicked() {
    this.showHideUserNamePage = true;
    this.showHidePasswordPage = false;
  }
  optService() { }

  onInputChange() {

    if (this.userName && this.userName.length === 10 && !isNaN(Number(this.userName))) {
      this.loginService.verifyUserName(this.userName).subscribe((res) => {
        if (res === true) {
          this.isUserNameValid = true;
        } else {
          this.isUserNameValid = false;
        }
      });
    }
  }
}
