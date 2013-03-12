/*
 * Copyright 2013 Cyril Vlaminck
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.cvlaminck.owm.model;

public abstract class Preciptation 
{
	private double m_volumePer3h;
	
	public Preciptation()
	{
	}

	public abstract String getType();
	
	public double geVolumePer3h() {
		return m_volumePer3h;
	}

	public void setVolumePer3h(double volumePer3h) {
		this.m_volumePer3h = volumePer3h;
	}
}
