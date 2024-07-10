import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sub-header',
  templateUrl: './sub-header.component.html',
  styleUrls: ['./sub-header.component.scss']
})
export class SubHeaderComponent implements OnInit {
  showSideNav: boolean = false;
  sideNavData: string[] = [];
  sideNavType: string = '';

  constructor(private router: Router) {}

  ngOnInit(): void {}

  navigateToMobiles() {
    this.router.navigateByUrl('app/electronics/mobiles');
  }

  navigateToLaptops() {
    this.router.navigateByUrl('');
  }

  openToggle(button: string) {
    this.showSideNav = true;
    if (button === 'all') {
      this.sideNavData = ['Option 1', 'Option 2', 'Option 3'];
      this.sideNavType = 'all';
    } else if (button === 'Mobiles') {
      this.sideNavData = ['Mobile Option 1', 'Mobile Option 2', 'Mobile Option 3'];
      this.sideNavType = 'mobiles';
    }
    console.log(`Button clicked: ${button}`);
    console.log(`showSideNav: ${this.showSideNav}`);
    console.log(`sideNavData: ${this.sideNavData}`);
  }

  closeSidenav() {
    this.showSideNav = false;
  }

  openDetails() {}
}
