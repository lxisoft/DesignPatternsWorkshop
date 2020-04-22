package com.sanjana.AnimalGame.command;

import com.sanjana.AnimalGame.Animal.*;
import com.sanjana.AnimalGame.Forest.*;

public class GoRightSPM implements CommandSPM{
AnimalSPM animal;
MovementSPM move;

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		move.GoRight();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("back to old place");
	}

}
