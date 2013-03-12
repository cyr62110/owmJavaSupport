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

public class Wind 
{
	private double m_speed;
	private double m_degree;
	private double m_gust = Double.MIN_VALUE;
	
	public Wind()
	{
	}

	public double getSpeed() {
		return m_speed;
	}

	public void setSpeed(double speed) {
		this.m_speed = speed;
	}

	public double getDegree() {
		return m_degree;
	}

	public void setDegree(double degree) {
		this.m_degree = degree;
	}
	
	public boolean hasGust() {
		return m_gust != Double.MIN_VALUE;
	}

	public double getGust() {
		return m_gust;
	}

	public void setGust(double gust) {
		this.m_gust = gust;
	}
}
