package com.example.learmspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.learmspringboot.Course;

@RestController // ky esht anotation qe na tregon se kjo eshte nje rest api kontroller
public class CurrencyConfigurationController {
	
	//tek pom.xml kemi shtuar nje dependecy "spring devTools dhe me te behet e mundur
	// qe serveri per cdo ndryshim qe ne kemi te behet refresh automatikisht
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	
	
	@RequestMapping("/currency-configuration")// krijimi i nje api
	public CurrencyServiceConfiguration retriveAllCourses(){
		return configuration;
	}

}
