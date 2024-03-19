import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sub-header',
  templateUrl: './sub-header.component.html',
  styleUrl: './sub-header.component.scss'
})
export class SubHeaderComponent implements OnInit {
  constructor(private router: Router) {

  }
  ngOnInit(): void {

  }

  navigateToMobiles() {
    this.router.navigateByUrl('app/electronics/mobiles');
  }

  navigateToLaptops() {
    this.router.navigateByUrl('');
  }

}
