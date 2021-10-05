package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.EmployeeEntity;

public interface EmployeeService {
	
	public EmployeeEntity saveEmployee(EmployeeEntity emp);
	public List<EmployeeEntity>getAllEmployee();

}
