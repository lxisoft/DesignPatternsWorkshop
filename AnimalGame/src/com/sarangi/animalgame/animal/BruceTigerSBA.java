/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sarangi.animalgame.animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sarangi.animalgame.zoo.ZooComponentSBA;

/**
 * TODO Provide a detailed description here
 * @author Owner
 * ,
 */
public class BruceTigerSBA extends TigerSBA {

	List<ZooComponentSBA> zooComponents = new ArrayList<ZooComponentSBA>();

	/**
	 * @param name
	 * @param description
	 */
	public BruceTigerSBA(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}
	
	public BruceTigerSBA()
	{
		super();
	}

	@Override
	public String toString() {
		return "Tiger";
	}
	
	public void add(ZooComponentSBA zooComponent){
		zooComponents.add(zooComponent) ;
	}
	
	public void remove(ZooComponentSBA zooComponent){
		zooComponents.remove(zooComponent) ;
	}
	
	public ZooComponentSBA getChild(int i){
		return (ZooComponentSBA)zooComponents.get(i);
	}
		
	public void print(){
		
		System.out.println("\n\t Animal Name -->"+getName()+"\n\t Description-->"+getDescription());
		System.out.println("\n\t-----------------------------------------------------------------------");
			
			Iterator<ZooComponentSBA> iterator = zooComponents.iterator();
			while (iterator.hasNext()) {
				ZooComponentSBA zooComponent = (ZooComponentSBA)iterator.next();
				zooComponent.print();
				
			}
			
		}

}
