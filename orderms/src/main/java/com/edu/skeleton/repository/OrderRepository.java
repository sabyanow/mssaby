package com.edu.skeleton.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.skeleton.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
