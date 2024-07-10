import { Component, EventEmitter, Input, Output, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-side-nav',
  templateUrl: './side-nav.component.html',
  styleUrls: ['./side-nav.component.scss']
})
export class SideNavComponent {
  @Input() navData: string[] | undefined;
  @Output() close = new EventEmitter<void>();
  toggle: boolean = false;
  sideNavType: string = '';

  ngOnChanges(changes: SimpleChanges) {
    if (changes['navData']) {
      console.log('navData changed:', this.navData);
      this.toggle = true;
    }
  }

  closeSidenav() {
    this.toggle = false;
    this.close.emit();
    console.log('Sidenav closed');
  }

  openToggle(button: string) {
    this.toggle = true;
    if (button === 'All') {
      this.navData = ['Option 1', 'Option 2', 'Option 3'];
    } else if (button === 'Mobiles') {
      this.navData = ['Mobile Option 1', 'Mobile Option 2', 'Mobile Option 3'];
    }
    console.log(`Button clicked: ${button}`);
    console.log(`toggle: ${this.toggle}`);
    console.log(`navData: ${this.navData}`);
  }
}
