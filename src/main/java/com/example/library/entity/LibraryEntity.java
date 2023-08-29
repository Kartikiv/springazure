package com.example.library.entity;

import java.util.Set;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class LibraryEntity {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;
	private String name;
	private String description;
	private Long stockAvailable;
	@ManyToMany
	private Set<Students> students;
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getStockAvailable() {
		return stockAvailable;
	}
	public void setStockAvailable(Long stockAvailable) {
		this.stockAvailable = stockAvailable;
	}
	public Set<Students> getStudents() {
		return students;
	}
	public void setStudents(Set<Students> students) {
		this.students = students;
	}
	public LibraryEntity(Long bookId, String name, String description, Long stockAvailable, Set<Students> students) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.description = description;
		this.stockAvailable = stockAvailable;
		this.students = students;
	}
	public LibraryEntity() {
		super();
	
	}

}
