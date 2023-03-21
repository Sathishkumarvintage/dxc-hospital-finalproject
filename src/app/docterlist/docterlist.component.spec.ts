import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DocterlistComponent } from './docterlist.component';

describe('DocterlistComponent', () => {
  let component: DocterlistComponent;
  let fixture: ComponentFixture<DocterlistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DocterlistComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DocterlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
