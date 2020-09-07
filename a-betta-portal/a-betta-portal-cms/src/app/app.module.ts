import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { ArticlesService } from './documents/articles.service';

import { AppComponent } from './app.component';
import { CmsHeaderComponent } from './cms-header/cms-header.component';
import { CmsFooterComponent } from './cms-footer/cms-footer.component';
import { CmsMainMenuComponent } from './cms-main-menu/cms-main-menu.component';
import { CmsListComponent } from './cms-list/cms-list.component';

import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CmsFormComponent } from './cms-form/cms-form.component';

const routes: Routes = [
  {path: '', redirectTo: '/a-betta-admincentral', pathMatch: 'full'},
  {path: 'a-betta-admincentral', component: CmsMainMenuComponent},
  {path: 'list', component: CmsListComponent},
  {path: 'form', component: CmsFormComponent},
  {path: 'form/:id', component: CmsFormComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    CmsHeaderComponent,
    CmsFooterComponent,
    CmsMainMenuComponent,
    CmsListComponent,
    CmsFormComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [ArticlesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
