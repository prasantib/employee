package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Long> {
    Department findByName(String name);
    Department findByUsers(String user);
    Object findByNameContainingIgnoreCase(String search);
}