import { Component, OnInit } from '@angular/core';
import { Doctor } from '../user';
import { DoctorService } from '../doctor.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adddoctor',
  templateUrl: './adddoctor.component.html',
  styleUrls: ['./adddoctor.component.css']
})
export class AdddoctorComponent implements OnInit {

  view=true;
  alert=false;
  show(){
    this.alert=true;
  }
  user:Doctor=new Doctor();

  constructor(private doctorService:DoctorService,private router:Router)
  {}
    ngOnInit(): void {
      
    }
  
saveDoctor()
{
  this.doctorService.createDoctor(this.user).subscribe(data=>{
    console.log(data);
    this.goToDoctorList();
  }),
    (  error: any)=>console.log(error);
}
goToDoctorList()
{
  this.router.navigate(['/doctors']);
}
onSubmit()
{
  console.log(this.user)
  this.saveDoctor();
  
}


}
