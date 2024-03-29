package com.example.learnspringframework;

import java.security.PublicKey;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.learnspringframework.game.GameRunner;
import com.example.learnspringframework.game.GamingConsole;
import com.example.learnspringframework.game.MarioGame;
import com.example.learnspringframework.game.PacmanGame;
import com.example.learnspringframework.game.SuperContraGame;



public class App03GamingSpringBeans {

	
	
	
	
	// krijuam ne context te appit qe te kemi akses te Beansat 
	public static void main(String[] args) {
		try(var context= new AnnotationConfigApplicationContext
				(GamingConfiguration.class))
		
	{
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();// kjo eshte metod 	qe kemi krijuar tek kjo gaming console
		
	}
		
			
		
		
		
		
		
		
		
		

	}

}
