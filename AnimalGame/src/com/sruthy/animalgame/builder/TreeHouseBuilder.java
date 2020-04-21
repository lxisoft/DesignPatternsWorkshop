package com.sruthy.animalgame.builder;

/**
 * @author sruthi
 * 
 * Implemented Builder Pattern, fecade pattern
 * 
 *
 */
public interface TreeHouseBuilder {
	
	public void buildTreeSKC();
	public void buildClimberSKC();
	public void buildDoorSKC();
	
	public TreeHouse getTreeHouseSKC(); 
	
	public void showTreeHouse();
	
	
}
