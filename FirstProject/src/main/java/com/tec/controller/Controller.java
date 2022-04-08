package com.tec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.tec.model.Employee;

import com.tec.service.ServiceInterface;

@RestController
public class Controller
{
	@Autowired
	ServiceInterface serviceInterface;
	
	@PostMapping("/save")
	public Employee saveobj(@RequestBody Employee employee )
	{
		System.out.println("chinnu");
		return serviceInterface.save(employee);
		 
	}
	
	@DeleteMapping("/delete/{firstname}")
	public String del(@PathVariable String firstname )
	{
		return  serviceInterface.delete(firstname);
		 
	}
	
	@PutMapping("/update/{id}")
	public Employee update(@PathVariable int id, @RequestBody Employee employee)
	{
		serviceInterface.update(id,employee);
		return null;
	}
	
	@GetMapping("/moresalary/{sal}")
	public List<Employee> moresal(@PathVariable long sal )
	{
		return serviceInterface.moresalary(sal);
		
	}
	
	@PutMapping("/updatesal/{id}/{sal}")
	public void upda(@PathVariable int id, @RequestBody long salary)
	{
		serviceInterface.updateBySalary(id,salary);
	
		
	}
	@GetMapping("/greaterExp/{experience}")
	public void hjgfk(@PathVariable int experience)
	{
		serviceInterface.showGreaterExperience(experience);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
