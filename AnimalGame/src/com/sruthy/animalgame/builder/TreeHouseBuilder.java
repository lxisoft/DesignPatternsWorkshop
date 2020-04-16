package com.sruthy.animalgame.builder;

/**
 * @author sruthi
 * 
 * Implemented Builder Pattern, fecade pattern
 * 
 *
 */
public interface TreeHouseBuilder {
	
	public void buildTree();
	public void buildClimber();
	public void buildDoor();
	
	public TreeHouse getTreeHouse(); 
	
}
