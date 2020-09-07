import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable, throwError, of} from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';
import {Articles} from './articles';
import { Router } from '@angular/router';


@Injectable()
export class ArticlesService {

  private endpoint: string = 'http://localhost:8080/a-betta-portal-webapp/api/articles';
  private httpHeaders = new HttpHeaders({ 'Content-Type': 'application/json' });
  articles: Articles[];

  constructor(private http: HttpClient,
    private router: Router) { }


  /**
  * Handle Http operation that failed.
  * Let the app continue.
  * @param operation - name of the operation that failed
  * @param result - optional value to return as the observable result
  */
  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      //this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

  getAll(): Observable<Articles[]> {
    return this.http.get<Articles[]>(this.endpoint + '/get').pipe(
      map((response) => response as Articles[]),
      tap(response => {
        console.log('ClienteService: tap 2');
        response.forEach(cliente => {
          console.log(cliente.name);
        });
      })
    );
  }

  get(id): Observable<Articles> {
    return this.http.get<Articles>(this.endpoint + "/get/" + id).pipe(
      catchError(e => {
        this.router.navigate(['/list']);
        console.error(e.error.message);
        return throwError(e);
      })
    )
  }

  create(articles: Articles): Observable<Articles> {
    return this.http.post(this.endpoint + "/create", articles, {headers: this.httpHeaders}).pipe(
      map((response: any) => response.articles as Articles),
      catchError(e => {
        if (e.status == 400) {
          return throwError(e);
        }
        console.error(e.error.message);
        return throwError(e);
      })
    );
  }

  update(articles: Articles): Observable<any> {
    return this.http.put(this.endpoint + "/update/" + articles.id, articles, {headers: this.httpHeaders}).pipe(
      catchError(e => {
        if (e.status == 400) {
          return throwError(e);
        }
        console.error(e.error.message);
        return throwError(e);
      })
    )
  }

  delete(id: string): Observable<Articles> {
    return this.http.delete<Articles>(this.endpoint + "/delete/" + id, {headers: this.httpHeaders}).pipe(
      catchError(e => {
        if (e.status == 400) {
          return throwError(e);
        }
        console.error(e.error.message);
        return throwError(e);
      })
    );
  }

}
