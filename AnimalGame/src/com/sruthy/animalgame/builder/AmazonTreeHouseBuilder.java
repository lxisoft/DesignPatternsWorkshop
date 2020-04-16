package com.sruthy.animalgame.builder;

public class AmazonTreeHouseBuilder implements TreeHouseBuilder{


	private TreeHouse treeHouse;
	

	public AmazonTreeHouseBuilder() {
		
		treeHouse = new TreeHouse();
	}

	@Override
	public void buildTree() {
		
		treeHouse.setTree("Teak Tree");
	}

	@Override
	public void buildClimber() {
		treeHouse.setClimber("climber made of bamboo");
		
	}

	@Override
	public void buildDoor() {
	
		treeHouse.setDoor("Mahagani Door");
	}
	
	
	public TreeHouse getTreeHouse() {
		
		return this.treeHouse;
	}
	
	

}
