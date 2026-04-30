package com.lucasgmoraes.backend_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasgmoraes.backend_project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
