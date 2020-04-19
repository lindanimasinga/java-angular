import { Component } from '@angular/core';
import { Person } from './models/person';
import { InterstellarService } from './services/interstellar-service.service';
import { ErrorResponse } from './models/error-response';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'sample-angular';
  person: Person =  new Person()
  errors = []

  constructor(private api: InterstellarService) {
  }

  sendData() {
    console.log(this.person)
    this.api.addPerson(this.person)
            .subscribe(() =>{
              console.log(`${this.person.name} added`)
            },
            (error: HttpErrorResponse) => {
                var errorResponse = error.error as ErrorResponse
                if(errorResponse.errors) {
                  this.errors = errorResponse.errors
                } else {
                  this.errors[0] = {
                   defaultMessage: errorResponse.error
                  }
                }
              }
            )
  }
}
