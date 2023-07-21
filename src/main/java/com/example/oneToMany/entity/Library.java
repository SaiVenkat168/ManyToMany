package com.example.oneToMany.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Library")
public class Library {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String book;

	public Library(String book) {
		super();
		this.book = book;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}	

}
