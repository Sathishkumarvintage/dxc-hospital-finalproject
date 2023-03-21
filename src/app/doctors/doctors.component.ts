import { Component } from '@angular/core';
import { Doctor } from '../user';
import { DoctorService } from '../doctor.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-doctors',
  templateUrl: './doctors.component.html',
  styleUrls: ['./doctors.component.css']
})
export class DoctorsComponent {

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
