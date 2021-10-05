package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public ResponseEntity<EmployeeEntity>saveEmployee(@RequestBody EmployeeEntity emp){
		EmployeeEntity employee=service.saveEmployee(emp);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<EmployeeEntity>>getAllEmployee(){
		List<EmployeeEntity>list=service.getAllEmployee();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
}
