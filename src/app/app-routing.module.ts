import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ApointmentComponent } from './apointment/apointment.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { MainComponent } from './main/main.component';
import { ServiceComponent } from './service/service.component';
import { DoctorsComponent } from './doctors/doctors.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { StatusComponent } from './status/status.component';
import { AdminComponent } from './admin/admin.component';
import { DocterlistComponent } from './docterlist/docterlist.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [
  {component:ApointmentComponent,path:'apointment'},
  {component:LoginComponent,path:'login'},
  {component:SignupComponent,path:'signup'},
  {component:MainComponent,path:'main'},
  {component:ServiceComponent,path:'service'},
  {component:DoctorsComponent,path:'doctors'},
  {component:HomeComponent,path:'home'},
  {component:AboutComponent,path:'about'},
  {component:StatusComponent,path:'status'},
  {component:AdminComponent,path:'admin'},
  {component:DocterlistComponent,path:'dlist'},
  {component:UpdateComponent,path:'update'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
