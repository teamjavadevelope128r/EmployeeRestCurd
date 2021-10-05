package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Employee_Details_table")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue
	private Integer empl_Id;
	private String empl_name;
	private Integer  empl_number;
	private String   empl_desiganation;
	private String   empl_department;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="empAddId")
	private List<EmployeeAddressDetails> details;

}
