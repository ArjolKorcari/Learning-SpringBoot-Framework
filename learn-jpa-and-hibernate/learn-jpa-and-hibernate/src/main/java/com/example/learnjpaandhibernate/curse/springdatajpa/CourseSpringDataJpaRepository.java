package com.example.learnjpaandhibernate.curse.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learnjpaandhibernate.curse.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Integer> {
	
	List<Course> findByAuthor(String author); // nese duam te bejm nje metod tjtj qe nuk eshte e gatshme
	// thesht emrin e metodes  dhe emrin e fudhes
	
	List<Course> findByName(String name);

}
