package com.example.learnspringframework;

import com.example.learnspringframework.game.GameRunner;
import com.example.learnspringframework.game.MarioGame;
import com.example.learnspringframework.game.PacmanGame;
import com.example.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		//var game= new MarioGame();
		//var superContraGame= new SuperContraGame();
		
		var game= new PacmanGame();// 1:Object Creation
		
		var gameRunner= new GameRunner(game);
		//2:Object Creation + Wiring of Dependecies
		// Game is a depenecy of GameRunner
		gameRunner.run();
		
		
		/*kur dy klasa jan te varura nga njera tjt
		 kemi te bejm me tight coupling */
		/* loose coupling eshte kur kto nuk jane te 
		 * varura nga njera tjetra prndh perdoren interfacet
		 */
		
		
		
		
		
		

	}

}
