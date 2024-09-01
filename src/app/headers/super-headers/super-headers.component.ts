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

  signOut(event: Event) {
    event.stopPropagation();
    this.router.navigateByUrl('/login');
  }

  goToYourAccount(event: Event) {
    event.stopPropagation();
    this.router.navigateByUrl('/app/profile');
  }


  goToCartPage(event: Event) {
    event.stopPropagation();
    this.router.navigateByUrl('/app/cart');
  }

  goToOrdersPage(event: Event) {
    event.stopPropagation();
    this.router.navigateByUrl('/app/order');
  }

  navigateToDashboard() {
    this.router.navigateByUrl('/app/dashboard')
  }

  wishFromAnyWebsite(event: Event) {
    event.stopPropagation();
  }
  babyWishlist(event: Event) {
    event.stopPropagation();
  }
  discoverYourStyle(event: Event) {
    event.stopPropagation();
  }
  exploreShowroom(event: Event) {
    event.stopPropagation();
  }
  yourRecommendations(event: Event) {
    event.stopPropagation();
  }
  yourPrimeMembership(event: Event) {
    event.stopPropagation();
  }
  yourPrimeVideo(event: Event) {
    event.stopPropagation();
  }
  yourSubscribeSaveItems(event: Event) {
    event.stopPropagation();
  }
  membershipsSubscriptions(event: Event) {
    event.stopPropagation();
  }
  yourSellerAccount(event: Event) {
    event.stopPropagation();
  }
  contentLibrary(event: Event) {
    event.stopPropagation();
  }
  devices(event: Event) {
    event.stopPropagation();
  }
  yourFreeAmazonBusinessAccount(event: Event) {
    event.stopPropagation();
  }
  switchAccounts(event: Event) {
    event.stopPropagation();
  }

  createWishList(event: Event) {
    event.stopPropagation();
  }
}
