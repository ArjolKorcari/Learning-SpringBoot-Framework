package com.example.learnjpaandhibernate.curse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.learnjpaandhibernate.curse.Course;
import com.example.learnjpaandhibernate.curse.jpa.CourseJpaRepository;
import com.example.learnjpaandhibernate.curse.springdatajpa.CourseSpringDataJpaRepository;



@Component
public class CourseCommandLinerRunner implements CommandLineRunner {
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//  @Autowired
//  private CourseJpaRepository repository;
//	@Override
//	public void run(String... args) throws Exception {
//		repository.insert(new Course(1,"Learn Spring JPA","in28minutes"));
//		repository.insert(new Course(2,"Learn Java JPA","in28minutes"));        // kjo esh jpa method nuk te duhet qe te shkr shum sql code 
//		repository.insert(new Course(3,"Learn DevOps JPA","in28minutes"));      // po e lidh direkt  tabelen me ane te kti kodi
//		repository.deleteById(1);
//		
//		System.out.println(repository.findById(2));
//		System.out.println(repository.findById(3));
//		
//	}
	
	@Autowired
	private CourseSpringDataJpaRepository repository;// kjo eshte spring jpa ndryshe nga metodat e tjera na ben nje konfigurim me te lehte
	// te kodit si dhe lidhje me te lehte me databazen pasi ka metoda te gatshme si finByID; delete etj...

  
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1,"Learn Spring JPA","in28minutes"));
		repository.save(new Course(2,"Learn Java JPA","in28minutes"));
		repository.save(new Course(3,"Learn DevOps JPA","in28minutes"));
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
		
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByAuthor(" "));
		
		System.out.println("Find by name method:"+" "+repository.findByName("Learn Java JPA"));
		
	}
	
	
	

}
