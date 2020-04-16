package com.neeraja.animalgame.animal.command;

import com.neeraja.animalgame.animal.AnimalNrj;

public class RunForwardNrj implements Command {

	AnimalNrj animal;
	
	public RunForwardNrj(AnimalNrj animal) {
		this.animal=animal;
	}
	@Override
	public void executeNrj() {
		System.out.println("running forward");
	}

	@Override
	public void undoNrj() {
		System.out.println("running backward");
	}

}
