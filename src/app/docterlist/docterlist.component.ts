import { Component, OnInit } from '@angular/core';
import { Doctor } from '../user';
import { DoctorService } from '../doctor.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-docterlist',
  templateUrl: './docterlist.component.html',
  styleUrls: ['./docterlist.component.css']
})
export class DocterlistComponent implements OnInit{

  view=false;
  show(){
    this.view=true;
  }
  user!:Doctor[];

  constructor(private userService:DoctorService,private router:Router)
  {}
 
   ngOnInit(): void {
     this.getDoctor();
   }
 
   getDoctor()
   {
     this.userService.getDoctorList().subscribe(data=>{
       this.user=data;
     });
   }
 
   
 
   updateDoctor(doctorId:number)
   {
     this.router.navigate(['user-details',doctorId]);
   }
 

}
