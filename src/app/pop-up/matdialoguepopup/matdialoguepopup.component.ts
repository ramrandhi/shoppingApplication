import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-matdialoguepopup',
  template: `
    <h2>OTP</h2>
    <p>Your OTP is: {{ data.otp }}</p>
  `,
})
export class MatdialoguepopupComponent {
  constructor(@Inject(MAT_DIALOG_DATA) public data: any) {}
}
