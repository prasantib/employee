package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
    ArrayList<Department> findByDepartmentNameContainingIgnoreCase(String departmentName);
}