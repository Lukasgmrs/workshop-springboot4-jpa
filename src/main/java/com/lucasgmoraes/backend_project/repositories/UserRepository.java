package com.lucasgmoraes.backend_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasgmoraes.backend_project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
