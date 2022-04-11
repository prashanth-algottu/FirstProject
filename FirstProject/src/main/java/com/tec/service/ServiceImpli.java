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
	
	@Override
	public Employee save(Employee employee)
	{
		
		return repo.save(employee);
		
		 
	}

	public String delete(String firstname) {
	
		repo.deleteByName(firstname);
		return "Deleted By the name : "+firstname;
	}

	@Override
	public Employee update(int id, Employee employee) {
		Object id1 = repo.findById(id);
		
		return repo.save(employee);
		
	}
	
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

	@Override
	public List<Employee> updateBySalary(int id, int salary) {
//		Optional<Employee> findById = repo.findById(id);
		 Optional<Employee> stream = repo.findById(id);
		System.out.println(stream);
		return null;
		
	}

	@Override
	public List<Employee> showGreaterExperience(int experience) {
		List<Employee> list = repo.findAll();
		List<Employee> list2 = list.stream().filter(i->i.getExperience()>experience).collect(Collectors.toList());
		
		return list2;
		
	}

	
	@Override
	public List<Employee> empNamesInTheDescend() {
			
		List<Employee> list = repo.findAll();
		List<Employee> collect = list.stream().sorted((i,j) -> j.getFirstname().compareToIgnoreCase(i.getFirstname())).
									collect(Collectors.toList());
		
		return collect;
	}

	

}
