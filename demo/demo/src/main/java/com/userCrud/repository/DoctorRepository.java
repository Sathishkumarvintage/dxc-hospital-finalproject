package com.userCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userCrud.model.Doctor;



@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
