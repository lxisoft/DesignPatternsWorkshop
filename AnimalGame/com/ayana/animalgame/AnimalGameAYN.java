package com.ayana.animalgame;

import java.io.IOException;
import java.util.Scanner;

import com.ayana.animalgame.forest.ForestAYN;

public class AnimalGameAYN extends GameAyn{
	

private static AnimalGameAYN instance = new AnimalGameAYN();
	
	private AnimalGameAYN(){
		
	}

	public static GameAyn getSingleObject()
	{
		return instance;
	}
	
	public void startPlayAYN() {
	      System.out.println("Animal Game Started. Enjoy the game!");
	   }
	
	public void createForestAYN() throws IOException
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Are you ready...?(yes=1/no=0)");
		String value = scan.next();
		ExpressionAYN exp = new TerminalExpressionAYN(value);
		if(exp.interpretAYN("1"))
		{
			ForestAYN forest =new ForestAYN();
			forest.getAnimalsAYN();
		}
		else
		{
			System.out.println("Exit from the game...");
		}
		
	}
}
