package com.javaproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.course.entities.OrderItem;
import com.javaproject.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
}
