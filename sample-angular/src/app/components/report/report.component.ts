import { Component, OnInit } from '@angular/core';
import { Person } from 'src/app/models/person';
import { InterstellarService } from 'src/app/services/interstellar-service.service';

@Component({
  selector: 'app-report',
  templateUrl: './report.component.html',
  styleUrls: ['./report.component.css']
})
export class ReportComponent implements OnInit {

  person: Person[] = [
  ]
  
  constructor(private api: InterstellarService) { }

  ngOnInit() {
    //TODO implement pagination
    this.api.getAllUsers()
      .subscribe(users => this.person = users)
  }

  deleteUser(user: Person) {
    this.api.getDeletePerson(user)
        .subscribe(() => this.ngOnInit())
  }

}
