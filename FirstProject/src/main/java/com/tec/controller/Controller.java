package com.tec.controller;

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

import com.tec.model.Employee;

import com.tec.service.ServiceInterface;

@RestController
public class Controller
{
	@Autowired
	ServiceInterface serviceInterface;
	
	@RequestMapping("/")
	public String page()
	{
		return "home.html";
	}
	
	
	// 1.Get All
	@GetMapping("/getAll")
	public List<Employee> getall()
	{
		return serviceInterface.getAll();
	}
	
	
	
	//2.Get By Id
	@GetMapping("/getEmpId/{id}")
	public Optional<Employee> getEmp(@PathVariable int id)
	{
		return serviceInterface.getById(id);
	}
	
	
	
	// 3.Saving
	@PostMapping("/save")
	public String saveobj(@RequestBody Employee employee )
	{
		System.out.println("chinnu");
		serviceInterface.save(employee);
		return "Inserted sucessfully";
		 
	}
	
	
	
	
	//4.Delete By name
	@DeleteMapping("/delete/{firstname}")
	public String del(@PathVariable String firstname )
	{
		serviceInterface.delete(firstname);
		return "deleted "+firstname +" Details";
		 
	}
	
	
	
	
	//5.Updating
	@PutMapping("/update1/{id1}")
	public String updateee(@RequestBody Employee employee  ,@PathVariable int id1)
	{
		serviceInterface.updateew(employee,id1);
		return "updated Sucessesfully";
	}
	
	
	
	//6. More than salary 
	@GetMapping("/moresalary/{sal}")
	public List<Employee> moresal(@PathVariable long sal )
	{
		return serviceInterface.moresalary(sal);
		
	}
	
	
	
	
	// 7.greater experience
	@GetMapping("/greaterExp/{experience}")
	public List<Employee> hjgfk(@PathVariable int experience)
	{
		return serviceInterface.showGreaterExperience(experience);
	}
	
	
	
	
	
	//8. Descending the names of employees
	@GetMapping("/empnamesindescend")
	public List<Employee> desc()
	{
	
		return serviceInterface.empNamesInTheDescend();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
