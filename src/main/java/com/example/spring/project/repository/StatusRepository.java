package com.example.spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.project.model.Status;

public interface StatusRepository extends JpaRepository<Status, Integer>{

}
