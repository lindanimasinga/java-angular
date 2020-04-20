import { BrowserModule } from '@angular/platform-browser';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { FormsModule }   from '@angular/forms';
import { DxPivotGridModule, DxChartModule } from 'devextreme-angular';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InterstellarService } from './services/interstellar-service.service';
import { HttpClientModule } from '@angular/common/http';
import { ReportComponent } from './components/report/report.component';
import { RegisterComponent } from './components/register/register.component';

@NgModule({
  declarations: [
    AppComponent,
    ReportComponent,
    RegisterComponent
  ],
  schemas: [
    CUSTOM_ELEMENTS_SCHEMA
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    DxPivotGridModule,
    DxChartModule
  ],
  providers: [InterstellarService],
  bootstrap: [AppComponent]
})
export class AppModule { }
