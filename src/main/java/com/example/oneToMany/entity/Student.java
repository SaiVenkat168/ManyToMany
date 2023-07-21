package com.example.oneToMany.entity;
import java.util.*;
import jakarta.persistence.*;

@Entity
@Table(name="Student")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	@Column
	private String name;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Studen_books", joinColumns = { @JoinColumn(name = "student_id") }, 
    inverseJoinColumns = { @JoinColumn(name = "Library_id") })
	private Set<Library> books=new HashSet<>();

	public Set<Library> getBooks() {
		return books;
	}

	public void setBooks(Set<Library> books) {
		this.books = books;
	}

	public Student(Set<Library> books) {
		super();
		this.books = books;
	}
	
	
	
	
}
