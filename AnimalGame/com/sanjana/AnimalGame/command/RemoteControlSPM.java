package com.sanjana.AnimalGame.command;

public class RemoteControlSPM {
	CommandSPM slot;
	
	public RemoteControlSPM() {
		
	}
	public void setCommandSPM(CommandSPM command) {
		slot = command;
		
	}
	 public void buttonPress() {        
		 slot.execute();    
	 } 
}
