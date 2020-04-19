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

}
