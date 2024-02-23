package com.example.learmspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.learmspringboot.Course;

@RestController // ky esht anotation qe na tregon se kjo eshte nje rest api kontroller
public class CourseController {
	
	//tek pom.xml kemi shtuar nje dependecy "spring devTools dhe me te behet e mundur
	// qe serveri per cdo ndryshim qe ne kemi te behet refresh automatikisht
	
	@RequestMapping("/curses")// krijimi i nje api
	public List<Course> retriveAllCourses(){
		return Arrays.asList(
				new Course (1, "Learn AWS", "in28minutes"),
				new Course (2, "Learn DevOps", "in28minutes"),
				new Course (3, "Learn Spring", "in28minutes"),
				new Course (4, "Learn  Hibernate", "in28minutes")
				
				
				);
	}

}
