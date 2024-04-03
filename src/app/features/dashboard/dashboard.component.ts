import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.scss'
})
export class DashboardComponent implements OnInit {

  constructor(private route: ActivatedRoute) { }
  ngOnInit(): void {
    this.route.queryParams.subscribe(params => {
      const isSpecial = params['isSpecial'];
      console.log('isSpecial:', isSpecial);
    });
  }

  toggleSidebar() {

  }

}
