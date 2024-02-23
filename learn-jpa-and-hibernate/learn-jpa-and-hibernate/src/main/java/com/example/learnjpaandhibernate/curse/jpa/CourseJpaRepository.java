package com.example.learnjpaandhibernate.curse.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.learnjpaandhibernate.curse.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional// sa her qe daum te egzekutojm queris me jpa na duhen transaction
public class CourseJpaRepository {
	
	@PersistenceContext // kjo eshte njesoj si autowired ben te njejten pun por eshte me specifike per nje repository
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);// kjo metoda murge ben te mundur insetimin e databazes tek h2 consoli
		
	}
	
	
	public Course findById(int id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(int id) {
		Course course = entityManager.find(Course.class, id);// per ta fshire fillimisht e gjejm kursin 
		entityManager.remove(course);// psj i ben remove cursit qe gjeti
		
		
	}

}
