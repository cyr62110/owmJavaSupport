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

public class Main 
{
	private double m_temperature;
	private double m_pressure;
	private double m_humidity;
	private double m_temperatureMin = Double.MIN_VALUE;
	private double m_temperatureMax = Double.MIN_VALUE;
	
	public Main()
	{
	}

	public double getTemperature() {
		return m_temperature;
	}

	public void setTemperature(double temperature) {
		this.m_temperature = temperature;
	}

	public double getPressure() {
		return m_pressure;
	}

	public void setPressure(double pressure) {
		this.m_pressure = pressure;
	}

	public double getHumidity() {
		return m_humidity;
	}

	public void setHumidity(double humidity) {
		this.m_humidity = humidity;
	}

	public boolean hasTemperatureMin() {
		return m_temperatureMin != Double.MIN_VALUE;
	}
	
	public double getTemperatureMin() {
		return m_temperatureMin;
	}

	public void setTemperatureMin(double temperatureMin) {
		this.m_temperatureMin = temperatureMin;
	}

	public boolean hasTemperatureMax() {
		return m_temperatureMax != Double.MIN_VALUE;
	}
	
	public double getTemperatureMax() {
		return m_temperatureMax;
	}

	public void setTemperatureMax(double temperatureMax) {
		this.m_temperatureMax = temperatureMax;
	}
	
}
