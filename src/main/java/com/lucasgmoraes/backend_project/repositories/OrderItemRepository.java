package com.lucasgmoraes.backend_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasgmoraes.backend_project.entities.OrderItem;
import com.lucasgmoraes.backend_project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
