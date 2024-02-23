package com.example.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name , int age, Addres address) {};
//In Java, a record is a special type of class declaration 
//aimed at reducing the boilerplate code, dmth kur perdorim kte skemi nevoj te krijojm getters setter konstruktor e kshu gjerash


record Addres(String firstLine, String city) {};


@Configuration // kjo esh anotation qe na tregon se eshte klase per konfigurime
public class HelloWorldConfiguration {
	
	// tek kjo mund te percaktojm spring bean
	/*In Spring, the objects that form the backbone of your application
	   and that aremanaged by the Spring IoC container are called beans 
	 */

	
	@Bean(name="name")
	public String name() {
		return "Albi";
	}
	
	@Bean(name="age")
	public int age() {
		return 20;
	}
	
	@Bean (name="person")
	@Primary
	public Person person() {
		return  new Person ("Arjol", 19,new Addres("Delijorgj", "Tirana") );
		
	}
	
	@Bean (name="person2MethodCall")// kjo ben te mundur qe te thirren metodat 
	public Person person2MethodCall(String name, int age, Addres address ) {
		
		
		return  new Person (name(), age(), address);// ktu i japim vlerat qe jan percaktuar lart
		
	}
	
	@Bean (name="person3Parameters")// kjo ben qe te jet direkt me parametra
	public Person person3Parameters(String name, int age, Addres address2) {
		return  new Person (name(), age(), address2());// ktu i japim vlerat qe jan percaktuar lart
		
	}
	
	@Bean (name="person4Parameters")
	public Person person4Parameters(String name, int age, Addres adress3  ) {
		return  new Person (name, age, adress3);// ktu i japim vlerat qe jan percaktuar lart
		
	}
	
	@Bean (name="address")
	@Primary// ky lloj anotation i jep perparsi nje lloj parametri qe mos te kem exeptiona kur i kompilojm
	public Addres address() {
		return new Addres("Kombinat", "Tirana");
	}
	@Bean (name="address2")
	public Addres address2() {
		return new Addres("21-Dhjetori", "Tirana");
	}
	
	// -: Nqs kemi exeption qe thuhet se kemi shume Beans (multiple Beans kur duam ti printojm nje zgjidhje eshte te bejme
	// nje nga kto @Primary ose te prd qualifier.
	
	

}
