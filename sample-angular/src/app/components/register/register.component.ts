import { Component, OnInit } from '@angular/core';
import { Person } from 'src/app/models/person';
import { InterstellarService } from 'src/app/services/interstellar-service.service';
import { HttpErrorResponse } from '@angular/common/http';
import { ErrorResponse } from 'src/app/models/error-response';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})

export class RegisterComponent {
  
  title = 'sample-angular';
  person: Person =  new Person()
  successful: boolean
  errors = []

  constructor(private api: InterstellarService) {
  }

  sendData() {
    console.log(this.person)
    this.api.addPerson(this.person)
            .subscribe(() =>{
              console.log(`${this.person.name} added`)
              this.successful = true
              this.errors = []
            },
            (error: HttpErrorResponse) => {
                this.successful = false
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
