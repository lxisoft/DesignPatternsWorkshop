package com.neeraja.animalgame.animal.command;

import com.neeraja.animalgame.animal.AnimalNrj;

public class RunBackwardNrj implements Command {
	
AnimalNrj animal;
	
	public RunBackwardNrj(AnimalNrj animal) {
		this.animal=animal;
	}

	@Override
	public void executeNrj() {
		System.out.println("running backward");
	}

	@Override
	public void undoNrj() {
		System.out.println("running forward");

	}

}
