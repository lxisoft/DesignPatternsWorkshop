package com.anjali.animalgame.animal;

public class BearANJ extends AnimalANJ implements Omnivorous{

	@Override
	public void meetAnotherAnimalANJ(AnimalANJ animal2) {
		
		if(animal2 instanceof Carnivorous){
			checkStrengthLevel(animal2);	
			}
			
			else if(animal2 instanceof Omnivorous){
			checkStrengthLevel(animal2);
			}

			else if(animal2 instanceof Herbivorous){
			checkHungerLevel(animal2);
			}
			
			else{
				System.out.println("Not valid");
			}
		
	}

	public void checkStrengthLevel(AnimalANJ animal2){
		System.out.println("Enter Strength Level of "+getAnimalName());
		setStrengthLevel(sc.nextInt());
		System.out.println("Enter Strength Level of "+animal2.getAnimalName());
		animal2.setStrengthLevel(sc.nextInt());
		fight(animal2);
		
		if(getStrengthLevel()>animal2.getStrengthLevel()){
			animal2.dead();
			}
			
		else if(getStrengthLevel()<animal2.getStrengthLevel()){
			dead();
			}
			
		else{
			System.out.println("Animals fight..nobody wins due to same strength level");
			}
		}
		
	public void checkHungerLevel(AnimalANJ animal2){
		System.out.println("enter the Hunger level of "+getAnimalName());
		setHungerLevel(sc.nextInt());
		System.out.println("enter the Hunger level of "+animal2.getAnimalName());
		animal2.setHungerLevel(sc.nextInt());
		
		if(getHungerLevel()>6){
			hunt(animal2,getAnimalName());
		    animal2.dead();
		}
		else{
			ignore(animal2);
			if(animal2.getHungerLevel()>6){
			((Herbivorous)animal2).graze();
			}
			else{
			System.out.println(animal2.getAnimalName()+" rest");	
			}
			
		}		
	}
	
	public void hunt(AnimalANJ b,String name){
		if(b instanceof Herbivorous){
			System.out.println(name+" eats "+b.getAnimalName());	
		}
		else if((b instanceof Carnivorous)||(b instanceof Omnivorous)){
			System.out.println(b.getAnimalName()+" eats "+name);	
		}
		else{
		System.out.println("Invalid");	
		}
	}	
}
