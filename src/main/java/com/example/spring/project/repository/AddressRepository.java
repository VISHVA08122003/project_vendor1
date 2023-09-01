package com.example.spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.project.model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{

}
