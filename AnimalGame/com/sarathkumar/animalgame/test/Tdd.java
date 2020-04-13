package com.sarathkumar.animalgame.test;
import com.sarathkumar.animalgame.model.*;
import java.util.*;
import java.io.*;

/**
 * @author SarathKumar S
 *
 */
public class Tdd {
	
	public static void main(String [] args) {
		
		AnimalSKS tiger = new TigerSKS();
		tiger.setEat();

		AnimalSKS goat = new GoatSKS();
		goat.setEat();
	}	
}
