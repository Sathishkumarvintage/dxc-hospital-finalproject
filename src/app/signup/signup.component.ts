import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit{
  
  alert:boolean=false;
    user:User=new User();
  
  constructor(private userService:UserService,private router:Router)
  {}
    ngOnInit(): void {
      
    }
  saveUser()
  {
    this.userService.createUser(this.user).subscribe(data=>{
      console.log(data);
      this.goToUserList();
    }),
      (  error: any)=>console.log(error);
  }
  goToUserList()
  {
    this.router.navigate(['/users']);
  }
  onSubmit()
  {
    console.log(this.user)
    this.saveUser();
    
  }
  show()
  {
    this.alert=true;
  }
  }
  


