import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SuperHeadersComponent } from './super-headers.component';

describe('SuperHeadersComponent', () => {
  let component: SuperHeadersComponent;
  let fixture: ComponentFixture<SuperHeadersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SuperHeadersComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SuperHeadersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
