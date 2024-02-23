package com.example.learnspringframework.game;

public class GameRunner {
  private GamingConsole game;

public GameRunner(GamingConsole game) {
	super();
	this.game = game;
}

public void run() {
	// TODO Auto-generated method stub
	System.out.println("Running this game "+game);
	game.up();
	game.down();
	game.left();
	game.right();
	
}
  
  

}
