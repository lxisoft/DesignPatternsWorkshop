package com.akhil.animalgame.command;


/**
 * @author Akhil
 * 
 *
 */

public class InvokerAKJ {
	
CommandAKJ command;
	
	public InvokerAKJ(CommandAKJ command) {
		this.command = command;
	}

	public void executeAKJ( ) {
		this.command.executeAKJ();
	}

}
