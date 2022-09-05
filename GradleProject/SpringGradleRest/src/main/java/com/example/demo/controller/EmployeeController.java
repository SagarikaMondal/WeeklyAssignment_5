package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@RestController
public class EmployeeController {
	@Autowired

	EmployeeRepo repo;

	 @PostMapping(path="/alien",consumes= {"application/json"})

	 public  Employee addAlien(@RequestBody Employee employee)

	 {

	 repo.save(employee);

	 return employee;

	 }
	 @GetMapping(path="/employ")

	 public List<Employee> getEmployee()

	 {

	 return (List<Employee>) repo.findAll();

	 }

	 @RequestMapping("/employee/{eno}")

	 public Optional<Employee> getAlien(@PathVariable("eno")int aid)

	 {

	 return repo.findById(aid);

	 }

	 @DeleteMapping("/employee/{eno}")

	 public String deleteAlien(@PathVariable int eno)

	 {

		 Employee e = repo.getOne(eno);

	 repo.delete(e);

	 return "deleted";

	 }

	 @PutMapping(path="/employee",consumes= {"application/json"})

	 public Employee saveOrUpdateAlien(@RequestBody Employee employee)

	 {

	 repo.save(employee);

	 return employee;

	 }

	}

