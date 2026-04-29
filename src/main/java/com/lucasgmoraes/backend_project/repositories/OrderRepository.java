package com.lucasgmoraes.backend_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasgmoraes.backend_project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
