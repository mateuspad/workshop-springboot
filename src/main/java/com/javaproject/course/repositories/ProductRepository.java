package com.javaproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
