package com.tec.service;

import java.util.List;

import com.tec.model.Employee;

public interface ServiceInterface 
{
	public Employee save(Employee employee);
	public String delete(String firstname);
	public Employee update(int id, Employee employee);
	public List<Employee> moresalary(long sal);
	public void updateBySalary(int id, long salary);
	public List<Employee> showGreaterExperience(int experience);

}
