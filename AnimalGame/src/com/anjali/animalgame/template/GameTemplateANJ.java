package com.anjali.animalgame.template;

/*
 * Game template class 
 */
public abstract class GameTemplateANJ {
	
	/*
	 * Template method
	 */
	public final void playGame() {	
																					
		setGame();										//abstract template methods. It is implemented in the subclasses
		startGame();							
		endGame();
		showResult();                                                        													
		
	}

	public abstract void setGame();
	
	public abstract void startGame();
	
	public void endGame() {
		System.out.println("Game over!!");
	}

	public abstract void showResult();


}
