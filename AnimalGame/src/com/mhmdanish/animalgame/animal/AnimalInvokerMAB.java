package com.mhmdanish.animalgame.animal;

public class AnimalInvokerMAB {
	
	CommandMAB command;
	
	public AnimalInvokerMAB(CommandMAB command) {
		this.command = command;
	}

	public void executeMAB( ) {
		this.command.executeMAB();
	}
}
