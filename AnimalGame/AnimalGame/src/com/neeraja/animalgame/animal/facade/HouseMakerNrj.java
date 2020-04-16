package com.neeraja.animalgame.animal.facade;

public class HouseMakerNrj {
	private HouseNrj treeHouse;
	private HouseNrj woodHouse;
	
	public HouseMakerNrj() {
		treeHouse = new TreeHouseNrj();
		woodHouse = new WoodHouseNrj();
	}

	
	public void buildTreeHouse() {
		treeHouse.buildNrj();
	}
	
	public void buildWoodHouse() {
		woodHouse.buildNrj();
	}
	
}
