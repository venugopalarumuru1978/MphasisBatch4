import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewAllEmpsComponent } from './view-all-emps.component';

describe('ViewAllEmpsComponent', () => {
  let component: ViewAllEmpsComponent;
  let fixture: ComponentFixture<ViewAllEmpsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViewAllEmpsComponent]
    });
    fixture = TestBed.createComponent(ViewAllEmpsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
