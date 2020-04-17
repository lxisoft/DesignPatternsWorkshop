package com.sruthy.animalgame.builder;

/**
 * @author sruthi
 * 
 * Implemented Builder Pattern
 *
 */

public class AmazonTreeHouseBuilder implements TreeHouseBuilder{


	private TreeHouse treeHouseSKC;
	

	public AmazonTreeHouseBuilder() {
		
		treeHouseSKC = new TreeHouse();
	}

	@Override
	public void buildTreeSKC() {
		
		treeHouseSKC.setTreeSKC("Teak Tree");
	}

	@Override
	public void buildClimberSKC() {
		treeHouseSKC.setClimberSKC("climber made of bamboo");
		
	}

	@Override
	public void buildDoorSKC() {
	
		treeHouseSKC.setDoorSKC("Mahagani Door");
	}
	
	
	public TreeHouse getTreeHouseSKC() {
		
		return this.treeHouseSKC;
	}

	

}
