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
package com.sarangi.animalgame.animalFactory;

import com.sarangi.animalgame.animal.BruceTigerSBA;
import com.sarangi.animalgame.animal.LionSBA;
import com.sarangi.animalgame.animal.PantheraAtroxLionSBA;
import com.sarangi.animalgame.animal.TigerSBA;

/**
 * TODO Provide a detailed description here
 * @author Owner
 * ,
 */
public class AmericanFatorySBA implements AnimalFactorySBA{

	/* (non-Javadoc)
	 * @see com.sarangi.animalgame.animalFactory.AnimalFactorySBA#createTigerSBA()
	 */
	
		@Override
		public TigerSBA createTigerSBA() {
			
			TigerSBA tiger = new BruceTigerSBA();
			
			return tiger;
		}

		/* (non-Javadoc)
		 * @see com.sarangi.animalgame.animalFactory.AnimalFactorySBA#createLionSBA()
		 */
		@Override
		public LionSBA createLionSBA() {
			
			LionSBA lion = new PantheraAtroxLionSBA();
			
			return lion;
		}
	

}
