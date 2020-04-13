package com.sarathkumar.animalgame.model;

/**
 * @author SarathKumar S
 *
 */
public abstract class AnimalSKS
{
	 AnimalTypeSKS animalType;
	// public AnimalSKS(AnimalTypeSKS animalTypeSKS){
 //      this.animalType = animalTypeSKS;
 //   }
	
	public void setEat() 
    {
        animalType.eat();
    }

}