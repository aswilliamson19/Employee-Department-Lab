package com.example.EmployeeDepartmentProject;

import com.example.EmployeeDepartmentProject.models.Department;
import com.example.EmployeeDepartmentProject.models.Employee;
import com.example.EmployeeDepartmentProject.models.Project;
import com.example.EmployeeDepartmentProject.repositories.DepartmentRepository;
import com.example.EmployeeDepartmentProject.repositories.EmployeeRepository;
import com.example.EmployeeDepartmentProject.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeDepartmentProjectApplicationTests {

	@Autowired
	DepartmentRepository deprep;
	@Autowired
	EmployeeRepository emprep;
	@Autowired
	ProjectRepository prorep;

	@Test
	void contextLoads() {
	}

	@Test
	void something() {
		Department dep = new Department("Haribo");
		deprep.save(dep);
		prorep.save(new Project("Sweets", 180));
		emprep.save(new Employee("Amanda", "Haribo", 1001, dep));
	}

}
