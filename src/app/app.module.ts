import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import { MainComponent } from './main/main.component';
import { SignupComponent } from './signup/signup.component';
import { ApointmentComponent } from './apointment/apointment.component';
import { ServiceComponent } from './service/service.component';
import { DoctorsComponent } from './doctors/doctors.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { AboutComponent } from './about/about.component';
import { UpdateComponent } from './update/update.component';
import { StatusComponent } from './status/status.component';
import { DocterlistComponent } from './docterlist/docterlist.component';
import { AdddoctorComponent } from './adddoctor/adddoctor.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    MainComponent,
    SignupComponent,
    ApointmentComponent,
    ServiceComponent,
    DoctorsComponent,
    HomeComponent,
    AdminComponent,
    AboutComponent,
    UpdateComponent,
    StatusComponent,
    DocterlistComponent,
    AdddoctorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
