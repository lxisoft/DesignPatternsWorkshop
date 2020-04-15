package com.mhmdanish.animalgame.command;

public class AnimalInvokerMAB {
	
	CommandMAB command;
	
	public AnimalInvokerMAB(CommandMAB command) {
		this.command = command;
	}

	public void executeMAB( ) {
		this.command.executeMAB();
	}
}
