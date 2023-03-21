package com.userCrud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userCrud.exception.BookNotFoundException;
import com.userCrud.model.Book;
import com.userCrud.repository.BookRepository;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class BookController
{

	@Autowired
	BookRepository bookRepository;
	
	@GetMapping("books")
	public List<Book> getAllBook()
	{
		return bookRepository.findAll();
	}
	
	@PostMapping("books")
	public Book saveBook(@RequestBody Book book)
	{
		return bookRepository.save(book);
	}
	
	@GetMapping("books/{id}")
	public ResponseEntity<Book> getBookbyId(@PathVariable(value="id") int id) throws BookNotFoundException
	{
		Book book = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not Exist with ID : "+id));
		return ResponseEntity.ok().body(book);
	}
	
	@DeleteMapping("books/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteUser(@PathVariable int id) throws BookNotFoundException
	{
		Book book = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not Exist with ID : "+id));
		bookRepository.delete(book);
		
		Map<String,Boolean> response=new HashMap<>();
		response.put("Deleted",Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("books/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book bookDetail) throws BookNotFoundException
	{
		Book book = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not Exist with ID : "+id));
		
		book.setFullname(bookDetail.getFullname());
		book.setMobilenumber(bookDetail.getMobilenumber());
		book.setEmail(bookDetail.getEmail());
		book.setSpecialists(bookDetail.getSpecialists());
		book.setDoctor(bookDetail.getDoctor());
		book.setReason(bookDetail.getReason());
		book.setAppointmentdate(bookDetail.getAppointmentdate());
		book.setAppointmenttime(bookDetail.getAppointmenttime());
		book.setAddress(bookDetail.getAddress());
		
		Book updatedBook=bookRepository.save(book);
		return ResponseEntity.ok(updatedBook);
	}
}
