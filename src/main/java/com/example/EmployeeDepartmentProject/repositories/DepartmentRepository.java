package com.example.EmployeeDepartmentProject.repositories;

import com.example.EmployeeDepartmentProject.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
