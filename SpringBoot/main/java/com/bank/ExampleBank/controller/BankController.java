package com.bank.ExampleBank.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:5173") // for no trailing slash
public class BankController {
	
	ArrayList<Employee> employees=new ArrayList<>();
	
	@GetMapping("/sayhello") ///usually runs on port no 8080
	public ArrayList<Employee> greeting() {
		if(employees.isEmpty()) {  ///every refresh in browser it can add multiple time
			employees.add(new Employee(1,"emp1",30000));
			employees.add(new Employee(2,"emp2",32000));
			employees.add(new Employee(2,"emp2",32000));
		}
		
		return employees;
		
	}
	
	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		employees.add(employee);
		return employee;
	}
	
}
