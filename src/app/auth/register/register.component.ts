import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { MasterDataService } from '../../MasterDataService';
import { RegisterService } from './register.service';
import { MatdialoguepopupComponent } from '../../pop-up/matdialoguepopup/matdialoguepopup.component';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent implements OnInit {
  showHideRegistrationPage: boolean = true;
  showHideOtpPage: boolean = false;
  mobileNumber: string = '';
  fullName: string = '';
  password: string = '';
  otp: string = '';
  selectedCountry = {
    "code": '',
    "value": '',
    "dialing_code": '',
  }
  countryDialingData: any[] = [];
  userInfo = {
    "firstName": '',
    "lastName": '',
    "mobileNumber": '',
    "password": '',
    "email": '',
    "countryCode": '',
    "countryName": '',
    "countryShortName": '',
  };

  mobileOtp = {
    "mobileNumber": '',
    "otp": '',
    "creataedDateTime": '',
    "expiryDateTime": ''
  }


  constructor(private router: Router,
    private masterDataService: MasterDataService,
    private registerService: RegisterService,
    private dialog: MatDialog) { }

  ngOnInit(): void {
    this.masterDataService.getAllCountries().subscribe((res) => {
      this.countryDialingData = res;
      this.selectedCountry = this.countryDialingData.find(country => country.code === 'IN');
    });

  }

  navigateToLogin() {
    this.router.navigateByUrl("/login")
  }
  verifyMobileNumber() {
    this.showHideRegistrationPage = false;
    this.showHideOtpPage = true;

    this.registerService.getOtp(this.mobileNumber).subscribe((res) => {
      if (res) {
        this.dialog.open(MatdialoguepopupComponent, { data: { otp: res } });
      }
    })

    const nameParts = this.fullName.split(" ");
    this.userInfo.firstName = nameParts.slice(0, -1).join(" ");
    this.userInfo.lastName = nameParts[nameParts.length - 1];
    this.userInfo.mobileNumber = this.mobileNumber;
    this.userInfo.password = this.password;
    this.userInfo.countryCode = this.selectedCountry.dialing_code;
    this.userInfo.countryName = this.selectedCountry.value;
    this.userInfo.countryShortName = this.selectedCountry.code;

    console.log(this.userInfo);
  };

  mobileNumberChangeClicked() {
    this.showHideRegistrationPage = true;
    this.showHideOtpPage = false;
  }

  registerUser() {
    this.registerService.registerUser(this.userInfo, this.otp).subscribe((res) => {
      if (res) {
        this.router.navigateByUrl('/app/dashboard');
      }
    })
  };

}
