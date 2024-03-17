import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-profiles',
  templateUrl: './profiles.component.html',
  styleUrl: './profiles.component.scss'
})
export class ProfilesComponent implements OnInit {

  items: String[] = ['Your Orders', 'Login & Security', 'Your Address', 'Payment Options', 'Contact Us'];

  ngOnInit(): void {

  }

  addProduct(){
    
  }

}
