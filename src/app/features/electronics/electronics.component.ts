import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-electronics',
  templateUrl: './electronics.component.html',
  styleUrl: './electronics.component.scss'
})
export class ElectronicsComponent implements OnInit {

  public ngOnInit(): void {
    
  }

  createWishList(event: Event){
    event.preventDefault();
  }
  wishFromAnyWebsite(event: Event){
    event.preventDefault();
  }
  babyWishlist(event: Event){
    event.preventDefault();
  }
  discoverYourStyle(event: Event){
    event.preventDefault();
  }

  exploreShowroom(event: Event){
    event.preventDefault();
  }

}
