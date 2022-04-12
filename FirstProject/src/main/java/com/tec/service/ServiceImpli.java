package com.tec.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.model.Employee;
import com.tec.repository.Repo;

@Service
public class ServiceImpli implements ServiceInterface{

	@Autowired
	Repo repo;
	
	//save
	@Override
	public Employee save(Employee employee)
	{
		
		return repo.save(employee);
	}

	//delete
	public void delete(String firstname) {
	
		repo.deleteByName(firstname);
		
	}

	//more salary
	@Override
	public List<Employee> moresalary(long sal) 
	{
		List<Employee> list = repo.findAll();
//		
//		List<Employee> list2 = new ArrayList<Employee>();
//		
//		for (Employee employee : list) {
//			if(employee.getSalary()>sal)
//			{
//				list2.add(employee);
//			}
//		}
		
		List<Employee> list2 = list.stream().filter(i->i.getSalary()>sal).collect(Collectors.toList());
		
			return list2;
	}


	//greater exp
	@Override
	public List<Employee> showGreaterExperience(int experience) {
		List<Employee> list = repo.findAll();
		List<Employee> list2 = list.stream().filter(i->i.getExperience()>experience).collect(Collectors.toList());
		
		return list2;
		
	}

	//descending order
	@Override
	public List<Employee> empNamesInTheDescend() {
			
		List<Employee> list = repo.findAll();
		List<Employee> collect = list.stream().sorted((i,j) -> j.getFirstname().compareToIgnoreCase(i.getFirstname())).
									collect(Collectors.toList());
		
		return collect;
	}

	// get by id
	@Override
	public Optional<Employee> getById(int id) {
		Optional<Employee> optional = repo.findById(id);
		return optional;
		
	}

	//get all records
	@Override
	public List<Employee> getAll() {
		List<Employee> list = repo.findAll();
		return list;
	}

	// update by salary
	@Override
	public void updateew(Employee employee, int id) {
		Employee  e1 = repo.getById(id);
		e1.setSalary(employee.getSalary());
		System.out.println(e1);
		repo.save(e1);
		
		
	}

	

	

}
