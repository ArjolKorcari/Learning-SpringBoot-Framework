package com.example.learnjpaandhibernate.curse;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // kjo perdoret tek SpringJpa i cili na ndihmon qe te lidhi direkt info qe kemi me ato qe jan ne databaz
public class Course {
	
	
	@Id
	private int id ;
	
	//@Column(name="name") kto jan anotation qe e lidhin kte direkt me tabelen
	private String name;
	
	//@Column(name="author")
	private String author;
	
	
	public Course() {
		
	}
	
	
	
	
	
	public Course(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}





	public int getId() {
		return id;
	}





	public String getName() {
		return name;
	}





	public String getAuthor() {
		return author;
	}


	public void setId(int id) {
		this.id = id;
	}





	public void setName(String name) {
		this.name = name;
	}





	public void setAuthor(String author) {
		this.author = author;
	}





	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	

}
