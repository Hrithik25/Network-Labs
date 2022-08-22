package com.training;

import javax.persistence.*;



@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@Column(name="id", nullable=false)
	@SequenceGenerator(name="emp_seq", sequenceName="emp_id_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="emp_seq")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
