import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PipesPageComponent } from './pipes-page.component';

describe('PipesPageComponent', () => {
  let component: PipesPageComponent;
  let fixture: ComponentFixture<PipesPageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PipesPageComponent]
    });
    fixture = TestBed.createComponent(PipesPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
