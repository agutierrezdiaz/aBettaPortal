import { Component, OnInit } from '@angular/core';
import swal from 'sweetalert2';
import { tap } from 'rxjs/operators';
import {Articles} from '../documents/articles';
import {ArticlesService} from '../documents/articles.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-cms-list',
  templateUrl: './cms-list.component.html'
})
export class CmsListComponent implements OnInit {

  articles: Articles[];
//   = [
//    { id: "1234", name: "pepe", title: "Pepe", subtitle: "Pues pepe pe", date: "01/01/2020", image: "", author: "Manolo, no Pepe", categories: ["Uno","Dos"]}
//  ];

  constructor(private articlesService: ArticlesService) { }

  ngOnInit() {
    this.articlesService.getAll()
      .subscribe(articles => this.articles = articles);
  }

}
