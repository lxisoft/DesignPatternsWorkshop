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

	public void showTreeHouse() {
        
		int i, j;
		int n= 7;
        
        // Printing the upper triangle  
        for (i = 0; i < n; i++) {  
    
            // Left space triangle  
            for (j = i + 1; j < n; j++)  
                System.out.print(" ");  
    
            // Center Star triangle  
            for (j = 0; j < (2 * i + 1); j++)  
                System.out.print("*");  
    
            System.out.println();  
        }  
    
        // Printing Lower rectangles  
        for (i = 0; i < 3; i++) {  
    
            // Left rectangle  
            for (j = 0; j < 3; j++)  
                System.out.print("*");  
    
            // Center Space rectangle  
            for (j = 0; j < (2 * n - 7); j++)  
                System.out.print(" ");  
    
            // Right rectangle  
            for (j = 0; j < 3; j++)  
                System.out.print("*");  
    
            System.out.println();  
        }  
	}
	

}
