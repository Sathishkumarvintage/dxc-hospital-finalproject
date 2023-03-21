import { Component, OnInit } from '@angular/core';
import { Book } from '../user';
import { BookService } from '../book.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-status',
  templateUrl: './status.component.html',
  styleUrls: ['./status.component.css']
})
export class StatusComponent implements OnInit {
  bookid!:number;
    user: Book = new Book();
  
  constructor(private userService:BookService,private route:ActivatedRoute){}
  
    ngOnInit(): void 
    {
      this.bookid=this.route.snapshot.params['bookid'];
  
      this.user=new Book();
      this.userService.getBookById(this.bookid).subscribe(data=>{
        this.user=data;
      })
    }
  
  }
  