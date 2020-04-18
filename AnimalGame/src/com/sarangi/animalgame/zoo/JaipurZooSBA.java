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
package com.sarangi.animalgame.zoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * TODO Provide a detailed description here
 * @author Owner
 * ,
 */
public class JaipurZooSBA extends ZooComponentSBA{
	
	List<ZooComponentSBA> zooComponents = new ArrayList<ZooComponentSBA>();
	
	private String name;
	private String description;
	
	/**
	 * @param name
	 * @param description
	 */
	public JaipurZooSBA(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		System.out.println("\n\t Zoo Name -->"+getName()+"\n\t Description-->"+getDescription());
		System.out.println("\n\t-----------------------------------------------------------------------");
			
			Iterator<ZooComponentSBA> iterator = zooComponents.iterator();
			while (iterator.hasNext()) {
				ZooComponentSBA zooComponent = (ZooComponentSBA)iterator.next();
				zooComponent.print();
				
			}
			
		}

	
}
