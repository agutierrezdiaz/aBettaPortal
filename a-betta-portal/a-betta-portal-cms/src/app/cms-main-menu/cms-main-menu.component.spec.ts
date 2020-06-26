import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CmsMainMenuComponent } from './cms-main-menu.component';

describe('CmsMainMenuComponent', () => {
  let component: CmsMainMenuComponent;
  let fixture: ComponentFixture<CmsMainMenuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CmsMainMenuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CmsMainMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
