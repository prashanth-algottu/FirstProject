package com.tec.service;

import java.util.List;
import java.util.Optional;

import com.tec.model.Employee;

public interface ServiceInterface 
{
	//save
	public Employee save(Employee employee);
	
	//delete
	public void delete(String firstname);
	
	//update by salary
	void updateew(Employee employee, int id);
	
	//moresaqlary
	public List<Employee> moresalary(long sal);
	
	// greater exop
	public List<Employee> showGreaterExperience(int experience);
	
	//Descending order
	public List<Employee> empNamesInTheDescend();
	
	// get by id
	public Optional<Employee> getById(int id);
	
	//get all the records
	public List<Employee> getAll();
	
	
	

	
	

}
