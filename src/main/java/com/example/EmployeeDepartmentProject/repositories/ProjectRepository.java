package com.example.EmployeeDepartmentProject.repositories;

import com.example.EmployeeDepartmentProject.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
