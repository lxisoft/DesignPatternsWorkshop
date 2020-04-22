package com.sanjana.AnimalGame.command;

public class GoLeftSPM implements CommandSPM{
MovementSPM move;

public GoLeftSPM(MovementSPM move) {
	// TODO Auto-generated constructor stub
	this.move=move;
}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		move.Goleft();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("back to old place");
	}
	

}
