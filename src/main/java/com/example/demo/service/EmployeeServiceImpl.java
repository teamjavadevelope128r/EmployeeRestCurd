package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity emp) {
             		
		return repo.save(emp);
	}

	@Override
	public List<EmployeeEntity> getAllEmployee() {
		 
		return repo.findAll();
	}

}
