package com.greeshma.animalgame.forest;

import com.greeshma.animalgame.ConfigGCG;
import com.greeshma.animalgame.animal.AnimalGCG;
import com.greeshma.animalgame.animal.LionGCG;
import com.greeshma.animalgame.animal.TigerGCG;
import com.greeshma.animalgame.command.AnimalCommandInvoker;
import com.greeshma.animalgame.command.CommandGCG;
import com.greeshma.animalgame.command.EatCommandGCG;
import com.greeshma.animalgame.decorator.IotGCG;
import com.greeshma.animalgame.decorator.MobileGCG;
import com.greeshma.animalgame.decorator.WebGCG;
import com.greeshma.animalgame.factory.AbstractAnimalFactoryGCG;
import com.greeshma.animalgame.factory.IotFactory;
import com.greeshma.animalgame.factory.MobileFactoryGCG;
import com.greeshma.animalgame.factory.WebFactoryGCG;
import com.greeshma.animalgame.iterator.AnimalIteratorGCG;

public class ForestGCG {
	 private volatile static ForestGCG uniqueInstance;
	 
	 AnimalGCG[] animals;
	 
	    private ForestGCG() {}
	 
	    public static ForestGCG getInstanceGCG() {        
	    	if (uniqueInstance == null) {            
	    		synchronized (ForestGCG.class) {               
	    			if (uniqueInstance == null) {                   
	    				uniqueInstance = new ForestGCG();               
	    				}            
	    			}       
	    		}  
	    	System.out.println("singleton");
	    	return uniqueInstance;    
	    	}

//		public void createAnimal() {
//			animals = new AnimalGCG[10];
//			animals[0] = new TigerGCG();
//			animals[1] = new HundableGCG(new TigerGCG());
//		}
		
		public void createAnimal() {
			
			String type = new ConfigGCG().getValueGCG();
			animals = new AnimalGCG[3];
			AbstractAnimalFactoryGCG animalFactory;
			if(type.equals("iot")) {
				animalFactory = new IotFactory();
				
			} else if(type.equals("mobile")) {
				animalFactory = new MobileFactoryGCG();
			}else{
				animalFactory = new WebFactoryGCG();
			}
			
			animals[0] = animalFactory.createAnimalGCG("tiger");
			animals[1] = animalFactory.createAnimalGCG("lion");
			animals[2] = animalFactory.createAnimalGCG("rabbit");
	
		}
		
		
		public void eatGCG() {
			
			AnimalIteratorGCG iterator = new AnimalIteratorGCG(animals);
			
			while(iterator.hasNext()) {
			eatGCG(iterator.next());
			}
			
		}
		
		private void eatGCG(AnimalGCG animal) {
			CommandGCG command = new EatCommandGCG(animal);
			AnimalCommandInvoker commandInvoker = new AnimalCommandInvoker(command);
			commandInvoker.executeGCG();
		}
}