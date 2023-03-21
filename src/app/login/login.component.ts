import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  uname!:string;
password!:string;
submitted=false;
isAuthenticated!:boolean;
isAuthenticated1!:boolean;
onSubmit(uname: string,password: string){
  this.uname=uname;
  this.password=password;
  
  if((this.uname=='sathish@gmail.com' && this.password=='sathish') || (this.uname=='saranya@gmail.com' && this.password=='saranya') || (this.uname=='sangamithra@gmail.com' && this.password=='sangamithra'))
  {
    this.isAuthenticated=true;
    this.submitted=true;
  }
  
  else if(this.uname=='admin@gmail.com' && this.password=='doctor')
  {
    this.isAuthenticated1=true;
    this.submitted=true;
  }
  
}
show(){
  this.submitted=true;
}
}
