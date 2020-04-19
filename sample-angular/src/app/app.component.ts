import { Component } from '@angular/core';
import { Person } from './models/person';
import { InterstellarService } from './services/interstellar-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'sample-angular';
  person: Person =  new Person()

  constructor(private api: InterstellarService) {
  }

  sendData() {
    console.log(this.person)
    this.api.addPerson(this.person)
            .subscribe(() =>
              console.log(`${this.person.name} added`)
            )
  }
}
