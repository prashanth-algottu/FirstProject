package com.tec.service;

import java.util.List;
import java.util.Optional;

import com.tec.model.Employee;

public interface ServiceInterface 
{
	public Employee save(Employee employee);
	public String delete(String firstname);
	public Employee update(int id, Employee employee);
	public List<Employee> moresalary(long sal);
	public List<Employee> updateBySalary(int id, int salary);
	public List<Employee> showGreaterExperience(int experience);
	public List<Employee> empNamesInTheDescend();
	

}
