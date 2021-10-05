package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Employee_Address_Details")
public class EmployeeAddressDetails {
	@Id
	@GeneratedValue
	private Integer address_id;
	private String  full_address;
	private String  address_type;
	
	
	

}
