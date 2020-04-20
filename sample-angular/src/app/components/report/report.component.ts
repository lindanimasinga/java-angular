import { Component, OnInit } from '@angular/core';
import { Person } from 'src/app/models/person';
import { InterstellarService } from 'src/app/services/interstellar-service.service';
import PivotGridDataSource from 'devextreme/ui/pivot_grid/data_source';

@Component({
  selector: 'app-report',
  templateUrl: './report.component.html',
  styleUrls: ['./report.component.css']
})
export class ReportComponent implements OnInit {

  person: Person[] = [
    {
      name: "test",
      surname: "user",
      idNumber: "89091"
    }
  ]
  
  constructor(private api: InterstellarService) { }

  ngOnInit() {
    //TODO implement pagination
    this.api.getAllUsers()
      .subscribe(users => {
        this.person = users
      })
  }

}
