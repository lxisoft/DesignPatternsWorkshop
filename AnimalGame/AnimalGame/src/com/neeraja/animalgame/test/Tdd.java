package com.neeraja.animalgame.test;

import com.neeraja.animalgame.animal.AnimalNrj;
import com.neeraja.animalgame.animal.TigerNrj;
import com.neeraja.animalgame.animal.command.AnimalInvokerNrj;
import com.neeraja.animalgame.animal.command.RunBackwardNrj;
import com.neeraja.animalgame.animal.command.RunForwardNrj;
import com.neeraja.animalgame.forest.ForestNrj;

public class Tdd {

	public static void main(String[] args) {
		
		//Singleton and adapter
		ForestNrj forest = ForestNrj.getInstanceNrj();
		forest.animalWalk();
		System.out.println(forest);
		//Strategy
		AnimalNrj tigerNrj=new TigerNrj();
		tigerNrj.setEatNrj();
		
		//clientRequirement
		forest.createAnimal();
		
		//Command Pattern
		AnimalInvokerNrj animalInvoker = new AnimalInvokerNrj();
		AnimalNrj tigerNrj2=new TigerNrj();
		RunForwardNrj runForward =new RunForwardNrj(tigerNrj2);
		RunBackwardNrj runBackward =new RunBackwardNrj(tigerNrj2);
		animalInvoker.setCommand(0, runForward, runBackward);
		
		animalInvoker.runForwardButton(0);
		animalInvoker.runBackwardButton(0);
		System.out.println(animalInvoker);
		animalInvoker.undoButtonWasPushed();
	}

}
