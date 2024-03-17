import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-super-headers',
  templateUrl: './super-headers.component.html',
  styleUrl: './super-headers.component.scss'
})
export class SuperHeadersComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {

  }

  navigateToProfile() {
    this.router.navigateByUrl('/app/profile');
  }
}
