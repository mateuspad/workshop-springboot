package com.javaproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
