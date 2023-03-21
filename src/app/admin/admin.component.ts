import { Component, OnInit } from '@angular/core';
import { Book } from '../user';
import { BookService } from '../book.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  submit=false;
show(){
  this.submit=true;
}
view=false;
visible(){
  this.view=true;
}
update=false;
show1()
{
  this.update=true;
}

user!:Book[];

 constructor(private userService:BookService,private router:Router)
 {}

  ngOnInit(): void {
    this.getBook();
  }

  getBook()
  {
    this.userService.getBookList().subscribe(data=>{
      this.user=data;
    });
  }

  

  updateUser(bookid:number)
  {
    this.router.navigate(['user-details',bookid]);
  }

  
}

