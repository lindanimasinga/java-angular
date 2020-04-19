import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { map } from 'rxjs/operators';
import { environment } from 'src/environments/environment';
import { Person } from '../models/person';
@Injectable({
  providedIn: 'root'
})
export class InterstellarService {


  constructor(private http: HttpClient) {
  }

  getAllPlanets(): Observable<Person[]> {
    return this.http.get<Person[]>(`${environment.url}/person`,{ 
    headers: new HttpHeaders(
      {
          'Content-Type': 'application/json',
      })});
  }
  
  addPerson(person: Person): Observable<any> {
    return this.http.post(`${environment.url}/person`, person, {
        headers: new HttpHeaders(
            {
                'Content-Type': 'application/json',
            })   
    }).pipe(
      map((resp: Response) => {
        console.log("checking error")
        if(resp.status == 200) {
          return resp
        } else {
          throwError(resp)
        }
      })
    );
}
}