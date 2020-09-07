import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CmsFormComponent } from './cms-form.component';

describe('CmsFormComponent', () => {
  let component: CmsFormComponent;
  let fixture: ComponentFixture<CmsFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CmsFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CmsFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
