import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Articles } from '../documents/articles';
import { ArticlesService } from '../documents/articles.service';

@Component({
  selector: 'app-cms-form',
  templateUrl: './cms-form.component.html'
})
export class CmsFormComponent implements OnInit {

  articles: Articles = new Articles();
  //private articleDate: Date = new Date();

  constructor(private router: Router,
    private activatedRoute: ActivatedRoute,
    private articlesService: ArticlesService
  ) { }

  ngOnInit(): void {
    this.get();
  }

  get(): void {
    this.activatedRoute.params.subscribe(params => {
      let id = params['id'];
      if (id) {
        this.articlesService.get(id).subscribe((articles) => this.articles = articles);
        //this.articleDate = new Date(this.articles.date);
      }
    })
  }



}
