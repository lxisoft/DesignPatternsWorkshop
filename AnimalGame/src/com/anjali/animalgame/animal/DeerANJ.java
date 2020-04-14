package com.anjali.animalgame.animal;

public class DeerANJ extends AnimalANJ implements Herbivorous{

	@Override
	public void meetAnotherAnimalANJ(AnimalANJ animal2) {
	
		if(animal2 instanceof Carnivorous){
				run(animal2);
			}	
			else if(animal2 instanceof Omnivorous){
				run(animal2);
			}
			else if(animal2 instanceof Herbivorous){
				ignore(animal2);
			}
			else{
				System.out.println("Not valid");
			}
		
	}

	@Override
	public void graze() {
		System.out.println(getAnimalName()+" graze for food");	 	
	}
	
	public void run(AnimalANJ animal){
		System.out.println(getAnimalName()+" Runs meeting "+animal.getAnimalName());
		
	}

}
