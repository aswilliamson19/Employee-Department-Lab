package com.example.EmployeeDepartmentProject.repositories;

import com.example.EmployeeDepartmentProject.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
