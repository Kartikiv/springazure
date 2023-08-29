package com.example.library.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "students")
public class Students {
	@Id
private Long id;
private String name;
private Date  dateOfBirth;
private String course;
private String address;
private Long yearCode;

public Students() {
	super();
	
}


public Students(Long id, String name, Date dateOfBirth, String course, String address, Long yearCode) {
	super();
	this.id = id;
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.course = course;
	this.address = address;
	this.yearCode = yearCode;
}


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Date getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Long getYearCode() {
	return yearCode;
}

public void setYearCode(Long yearCode) {
	this.yearCode = yearCode;
}


}
