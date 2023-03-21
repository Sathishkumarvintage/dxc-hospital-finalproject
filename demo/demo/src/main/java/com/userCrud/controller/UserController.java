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

import com.userCrud.exception.UserNotFoundException;
import com.userCrud.model.User;
import com.userCrud.repository.UserRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class UserController
{

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("users")
	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	}
	
	@PostMapping("users")
	public User saveUser(@RequestBody User user)
	{
		return userRepository.save(user);
	}
	
	@GetMapping("users/{id}")
	public ResponseEntity<User> getUserbyId(@PathVariable(value="id") int id) throws UserNotFoundException
	{
		User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not Exist with ID : "+id));
		return ResponseEntity.ok().body(user);
	}
	
	@DeleteMapping("users/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteUser(@PathVariable int id) throws UserNotFoundException
	{
		User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not Exist with ID : "+id));
		userRepository.delete(user);
		
		Map<String,Boolean> response=new HashMap<>();
		response.put("Deleted",Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User userDetail) throws UserNotFoundException
	{
		User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not Exist with ID : "+id));
		
		user.setFname(userDetail.getFname());
		user.setPhonenumber(userDetail.getPhonenumber());
		user.setEmail(userDetail.getEmail());
		user.setPassword(userDetail.getPassword());
		
		User updatedUser=userRepository.save(user);
		return ResponseEntity.ok(updatedUser);
	}
}
