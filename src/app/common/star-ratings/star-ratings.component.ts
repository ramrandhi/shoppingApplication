import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-star-ratings',
  templateUrl: './star-ratings.component.html',
  styleUrl: './star-ratings.component.scss'
})
export class StarRatingsComponent {

  @Input() rating: number = 0;
  @Output() ratingChange: EventEmitter<number> = new EventEmitter<number>();

  stars: boolean[] = Array(5).fill(false);

  onRate(rating: number): void {
    this.rating = rating;
    this.ratingChange.emit(this.rating);
  }
}
