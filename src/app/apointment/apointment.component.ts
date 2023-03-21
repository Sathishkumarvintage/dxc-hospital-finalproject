import { Component, OnInit } from '@angular/core';
import { Book } from '../user';
import { BookService } from '../book.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-apointment',
  templateUrl: './apointment.component.html',
  styleUrls: ['./apointment.component.css']
})
export class ApointmentComponent implements OnInit {
 
submitted:boolean=false;
alert:boolean=false;
fullname!:string;
specialists!:string;
doctor!:string;
appointmentdate!:string;
appointmenttime!:string;

 user:Book=new Book();

constructor(private bookService:BookService,private router:Router)
{}
  ngOnInit(): void {
    
  }
saveBook()
{
  this.bookService.createBook(this.user).subscribe(data=>{
    console.log(data);
    this.goToBookList();
  }),
    (  error: any)=>console.log(error);
}
goToBookList()
{
  this.router.navigate(['/book']);
}
onSubmit()
{
  console.log(this.user)
  this.saveBook();
  
}
show( fullname:string,specialists:string,doctor:string,appointmentdate:string,appointmenttime:string)
{
  this.fullname=fullname;
  this.specialists=specialists;
  this.doctor=doctor;
  this.appointmentdate=appointmentdate;
  this.appointmenttime=appointmenttime;
  this.submitted=true;
}
view()
{
this.alert=true
}
}
