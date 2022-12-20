package com.javaproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
