package com.anjali.animalgame.animal.adapter.adapter;

import com.anjali.animalgame.animal.adapter.adaptee.ILeopardANJ;
import com.anjali.animalgame.animal.adapter.target.IJaguarANJ;

/*
 * Jaguar adapter implementing adaptee 
 */
public class JaguarAdapterANJ implements ILeopardANJ{

	IJaguarANJ jaguar;
	
	public JaguarAdapterANJ(IJaguarANJ jaguar) {
		this.jaguar = jaguar;
	}

	@Override
	public void climbTree() {
		jaguar.climbTreeSlow();
	}

	@Override
	public void run() {
		jaguar.run();
	}

}
