package com.greeshma.animalgame.command;

public class AnimalCommandInvoker {

	CommandGCG command;
	public AnimalCommandInvoker(CommandGCG command) {
		this.command = command;
	}
	
	public void executeGCG() {
		command.executeGCG();
	}
}
