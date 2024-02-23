package com.example.learnjpaandhibernate.curse.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.learnjpaandhibernate.curse.Course;


@Repository // kur nje klas ka lidhje me nje databaz ky eshte anotationi qe perdorim
public class CourseJdbcRepository {
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	private static String INSERT_QUERY=
			
			
			"""
			insert into course(id, name, author)
			values(?, ?, ?);
			
			
			
			""";
	
private static String DELETE_QUERY=
			
			
			"""
			delete from course
			where id=?
			
			
			
			""";
private static String SELECT_QUERY=


"""
		
select * from course
where id=?



""";
	
	
	public void insert(Course course ) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(),
				course.getName(), course.getAuthor());// pjeset te cilat jane me ? tek tabela qe kemi krijuar me 
		// siper do te zevendesohen me kto id,name,author qe kemi shkr dhe do te merren automatikisht nga kursi
		
	}
	
	
	public void deleteById(int id) {
		springJdbcTemplate.update(DELETE_QUERY,id);
		
		// kjo eshte e njejta metod si ajo me lart por i ben delete nje te kursi ne databaz vetm nga id
		
		
	}
	
	public Course findById(int id) {
		 return springJdbcTemplate.queryForObject(SELECT_QUERY,
				new BeanPropertyRowMapper<>(Course.class),id);
		
		//ResultSet-> Bean(Curse) kjo tn duhet te na kthehet si tip tabele dhe ato qe e bejn kte ne java 
		// jan mapCollectin edhe nje metod qe e ben te mundur kte eshte BeanPropertyRowMapper<>(Course.class)
		
	}


}
