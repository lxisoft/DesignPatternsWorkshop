/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sarangi.animalgame.stageLight;



/**
 * The RemoteControlSBA class implements an gameLights using Command Dp
 * @author Owner
 * ,
 */
public class RemoteControlSBA {
	
	CommandSBA[] onCommands ;
	
	public RemoteControlSBA()
	{
		onCommands = new CommandSBA[2];
				
		CommandSBA noCommand = new NoCommandSBA();
		
		for(int i=0;i<onCommands.length;i++)
		    onCommands[i] = noCommand;		
	}
	
	public void setCommands(int slot,CommandSBA onCommand)
	{
		onCommands[slot] = onCommand;
	}
	
	public void onButtonWasPushed(int slot)
	{
		onCommands[slot].execute();
	}

	@Override
	public String toString() {
		return "RemoteControlSBA onCommands =" + onCommands;
	}
	
	

}
