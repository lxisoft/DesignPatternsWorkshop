package com.anjali.animalgame.animal;

import com.anjali.animalgame.observer.DangerSubject;
import com.anjali.animalgame.observer.Observer;
import com.anjali.animalgame.observer.Subject;
import com.anjali.animalgame.strategy.impl.Herbivore;

/*
 * Observer class observing DangerSubject
 */
public class RabbitANJ extends AnimalANJ implements Observer{

	private Boolean isDanger;
	private Subject dangerSubject;
	
	public RabbitANJ(Subject dangerSubject) {
		this.dangerSubject = dangerSubject;
		dangerSubject.register(this);
		}

	public RabbitANJ() {
		foodEatBehaviour=new Herbivore(); //setting strategy pattern behaviour
	}

	@Override
	public void meetAnotherAnimalANJ(AnimalANJ animal2) {
		
		/*if(animal2.getFoodEatBehaviour() instanceof HuntFood){
			System.out.println("observer rabbit");
			notifyDanger();
			run(animal2);
			}
			
			else if(animal2.getFoodEatBehaviour() instanceof GrazeFood){
			ignore(animal2);
			}
			
			else{
				System.out.println("Not valid");
			}
	*/	
	}

	
	public void graze() {
		this.eat();		//strategy behaviour invoked 	
	}
	
	public void run(AnimalANJ animal){
		System.out.println(getAnimalName()+" Runs meeting "+animal.getAnimalName());
		
	}
	
	public void notifyDanger() {
		System.out.println("Rabbit notifyDanger");           /*  update subject Observer pattern*/
		
		RabbitANJ observer1=new RabbitANJ(DangerSubject.getInstance());
		DangerSubject.getInstance().getUpdate(this.isDanger);
	}

	@Override
	public void update(Boolean isDanger) {    
		System.out.println("Run fast!!");
	}

}
