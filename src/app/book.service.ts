import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Book } from './user';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseURL="http://localhost:8083/api/v1/books";
   
  
  constructor(private httpClient:HttpClient) { }


  getBookList():Observable<Book[]>
  {
    return this.httpClient.get<Book[]>(`${this.baseURL}`);
  }

createBook(user:Book):Observable<Object>{

  return this.httpClient.post(`${this.baseURL}`,user);
}

getBookById(bookid:number):Observable<Book>
{
  return this.httpClient.get<Book>(`${this.baseURL}/${bookid}`)
}

updateBook(bookid:number,user:Book):Observable<Object>
{
  return this.httpClient.put(`${this.baseURL}`,user);
}

deleteBook(bookid:number):Observable<Object>
{
  return this.httpClient.delete(`${this.baseURL}/${bookid}`)
}

}