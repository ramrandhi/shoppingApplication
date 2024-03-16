import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent implements OnInit {
  // loginForm: FormGroup;

  constructor(
    private router: Router,
    private fb:FormBuilder
  ) {
    // this.loginForm;
   }

  ngOnInit(): void {
    // this.buildForm();
  }

  // private buildForm(): void {
  //   this.loginForm = new FormGroup({
  //     email: new FormControl('', [Validators.required]),
  //     password: new FormControl('', [Validators.required]),
  //   });
  // }

  submitLoginInfo() {
    console.log("hello");
    this.router.navigateByUrl('/app/dashboard');
  }
}
