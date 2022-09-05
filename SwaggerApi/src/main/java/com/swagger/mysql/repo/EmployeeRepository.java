package com.swagger.mysql.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swagger.mysql.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

