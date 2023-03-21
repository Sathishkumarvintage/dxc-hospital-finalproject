import { Component, OnInit } from '@angular/core';
import { Book } from '../user';
import { BookService } from '../book.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit{

  bookid!:number;
  user:Book=new Book();

  constructor(private userService:BookService,private router:Router)
  {}
  
  
  
  
  
  ngOnInit(): void {
   this.userService.getBookById(this.bookid).subscribe(data=>{
    this.user=data;
   }),
     (   error: any)=>console.log(error);
  }

  onSubmit()
  {
    this.userService.updateBook(this.bookid,this.user).subscribe(data=>{
      this.goToBookList();
    })
  }
goToBookList()
{
this.router.navigate(['/books']);
}
}


