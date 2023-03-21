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

import com.userCrud.exception.DoctorNotFoundException;
import com.userCrud.model.Doctor;
import com.userCrud.repository.DoctorRepository;



@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class DoctorController
{

	@Autowired
	DoctorRepository doctorRepository;
	
	@GetMapping("doctors")
	public List<Doctor> getAllDoctors()
	{
		return doctorRepository.findAll();
	}
	
	@PostMapping("doctors")
	public Doctor saveDoctor(@RequestBody Doctor doctor)
	{
		return doctorRepository.save(doctor);
	}
	
	@GetMapping("doctors/{id}")
	public ResponseEntity<Doctor> getDoctorbyId(@PathVariable(value="id") int id) throws DoctorNotFoundException
	{
		Doctor doctor = doctorRepository.findById(id).orElseThrow(() -> new DoctorNotFoundException("Doctor not Exist with ID : "+id));
		return ResponseEntity.ok().body(doctor);
	}
	
	@DeleteMapping("doctors/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteUser(@PathVariable int id) throws DoctorNotFoundException
	{
		Doctor doctor = doctorRepository.findById(id).orElseThrow(() -> new DoctorNotFoundException("Doctor not Exist with ID : "+id));
		doctorRepository.delete(doctor);
		
		Map<String,Boolean> response=new HashMap<>();
		response.put("Deleted",Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("doctors/{id}")
	public ResponseEntity<Doctor> updateDoctor(@PathVariable int id, @RequestBody Doctor doctorDetail) throws DoctorNotFoundException
	{
		Doctor doctor = doctorRepository.findById(id).orElseThrow(() -> new DoctorNotFoundException("Doctor not Exist with ID : "+id));
		
		doctor.setDoctorname(doctorDetail.getDoctorname());
		doctor.setSpecialists(doctorDetail.getSpecialists());
		
		
		Doctor updatedDoctor=doctorRepository.save(doctor);
		return ResponseEntity.ok(updatedDoctor);
	}
}
