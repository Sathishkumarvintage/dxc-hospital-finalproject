package com.userCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userCrud.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
