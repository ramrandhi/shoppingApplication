import { Component, OnInit, TemplateRef, ViewChild } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sub-header',
  templateUrl: './sub-header.component.html',
  styleUrl: './sub-header.component.scss'
})
export class SubHeaderComponent implements OnInit {
  @ViewChild('tooltipTemplateRef') tooltipTemplate: TemplateRef<any> | undefined;
  toggle: boolean = false;
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

  openToggle() {
    this.toggle = true;
  }

  closeSidenav() {
    this.toggle = false;
  }

  openDetails(){
    
  }

}
