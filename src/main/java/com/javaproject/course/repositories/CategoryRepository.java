package com.javaproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
