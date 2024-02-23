package com.example.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.learnspringframework.game.GameRunner;
import com.example.learnspringframework.game.MarioGame;
import com.example.learnspringframework.game.PacmanGame;
import com.example.learnspringframework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		
		try(//1: launch a Spring Context 
		var context =
			new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);){
			//2: Configure the things that we want Spring to manage- @Configuration
			// kte e bem duke krijuar kte klasen HelloWorldConfiguration-@Configuratin
			// dhe i dham nje objekt(bean) name-@Bean
			
			//3:Afishojm kto bens qe  menaxhohen nga sprinbgu me kte metoden getBean
		
	            System.out.println(context.getBean("name"));
	            
	            System.out.println(context.getBean("age"));
	            
	            System.out.println(context.getBean("person"));
	            
	            System.out.println(context.getBean("address"));
	            
	            System.out.println(context.getBean("person2MethodCall"));
	            System.out.println("Metoda me parametra "+context.getBean("person3Parameters"));
	            
	           System.out.println(context.getBean(Addres.class));
	            
	            //kjo dmth i ben System.out gjithe Beansave  dhe eshte metod e gatshme qe printon arrays 
//	            Arrays.stream(context.getBeanDefinitionNames()).
//	            forEach(System.out::println);
			
		}
		
		
		
		
		
           
		
	}

}
