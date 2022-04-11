package com.tec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tec.model.Employee;

@Repository
public interface Repo extends JpaRepository<Employee, Integer> 
{
	
	@Query(value = "delete from employee where firstname=?", nativeQuery = true )
	public void deleteByName(String name);

}
