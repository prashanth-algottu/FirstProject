package com.tec.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{
	@Id
	private int id;
	private String firstname;
	private String lastname;
	private int experience;
	private long salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String firstname, String lastname, int experience, int salary) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.experience = experience;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [" + id + ", " + firstname + ", " + lastname + ", "
				+ experience + ", " + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
	

}
