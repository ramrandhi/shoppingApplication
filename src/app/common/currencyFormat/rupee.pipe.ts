import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'rupee'
})
export class RupeePipe implements PipeTransform {

  transform(value: number): string {
    if (!value) {
      return '';
    }
    let formattedValue = value.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ',');

    // Append rupee symbol
    return `₹ ${formattedValue}`;
  }

}
