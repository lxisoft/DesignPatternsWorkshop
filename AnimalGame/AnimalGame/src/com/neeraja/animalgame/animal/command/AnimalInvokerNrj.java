package com.neeraja.animalgame.animal.command;

public class AnimalInvokerNrj {

	Command[] runForwardCommands;
	Command[] runBackwardCommands;
	Command undoCommand;
	
	
	public AnimalInvokerNrj() {
		runForwardCommands = new Command[7];
		runBackwardCommands = new Command[7];
		Command noCommand = new NoCommand();
		for(int i=0;i<7;i++) {
			runForwardCommands[i] = noCommand;
			runBackwardCommands[i] = noCommand;
		}
		undoCommand = noCommand;
		}
	
	
	public void setCommand(int slot, Command runForwardCommand, Command runBackwardCommand) {
		runForwardCommands[slot] = runForwardCommand;
		runBackwardCommands[slot] = runBackwardCommand;
		}
	
	public void runForwardButton(int slot) {
		runForwardCommands[slot].executeNrj();
		undoCommand = runForwardCommands[slot];
		}
	
	public void runBackwardButton(int slot) {
		runBackwardCommands[slot].executeNrj();
		undoCommand = runBackwardCommands[slot];
		}
	
	public void undoButtonWasPushed() {
		undoCommand.undoNrj();
		}

}
