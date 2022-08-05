import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateOrderReceivedComponent } from './update-order-received.component';

describe('UpdateOrderReceivedComponent', () => {
  let component: UpdateOrderReceivedComponent;
  let fixture: ComponentFixture<UpdateOrderReceivedComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateOrderReceivedComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateOrderReceivedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
