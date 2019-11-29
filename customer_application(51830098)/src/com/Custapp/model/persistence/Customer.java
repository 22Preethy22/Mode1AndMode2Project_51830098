package com.Custapp.model.persistence;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "Custapp_access_table")
public class Customer {

	@Id
	@GeneratedValue
	private int id;

	@NotEmpty(message = "name cannot be left blank")
	private String name;

	@NotEmpty(message = "address cannot be left blank")
	private String address;

	@NotEmpty(message = "mobile cannot be left blank")
	private String mobile;

	@javax.validation.constraints.NotNull(message = "salary cannot be null")
	private Double salary;

	@Email
	@NotEmpty(message = "email cant be left blank")
	private String email;

	private String Employee;

	public Customer() {
		super();
	}

	public Customer(String name, String address, String mobile, Double salary, String email) {
		super();
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.salary = salary;
		this.email = email;
	}

	public Customer(int id, String name, String address, String mobile, Double salary, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.salary = salary;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployee() {
		return Employee;
	}

	public void setEmployee(String employee) {
		Employee = employee;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", mobile=" + mobile + ", salary="
				+ salary + ", email=" + email + ", Employee=" + Employee + "]";
	}

}
