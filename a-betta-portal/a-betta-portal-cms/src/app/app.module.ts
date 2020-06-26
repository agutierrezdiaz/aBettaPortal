import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CmsHeaderComponent } from './cms-header/cms-header.component';
import { CmsFooterComponent } from './cms-footer/cms-footer.component';
import { CmsMainMenuComponent } from './cms-main-menu/cms-main-menu.component';

@NgModule({
  declarations: [
    AppComponent,
    CmsHeaderComponent,
    CmsFooterComponent,
    CmsMainMenuComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
