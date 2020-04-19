import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
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
    });
}
}