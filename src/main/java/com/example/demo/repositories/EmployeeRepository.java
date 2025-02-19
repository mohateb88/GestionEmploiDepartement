package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Employee;

import jakarta.transaction.Transactional;
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
