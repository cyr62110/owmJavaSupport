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

import java.util.Date;
import java.util.List;

public class Weather 
{
	private Date m_date = null;
	private City m_city = null;
	private Main m_main = null;
	private Wind m_wind = null;
	private List<WeatherCondition> m_conditions = null;
	private int m_cloudiness = 0;
	private Preciptation m_precipitation = null;
	
	public Weather()
	{
		
	}

	public Date getDate() {
		return m_date;
	}

	public void setDate(Date m_date) {
		this.m_date = m_date;
	}

	public City getCity() {
		return m_city;
	}

	public void setCity(City m_city) {
		this.m_city = m_city;
	}

	public Main getMain() {
		return m_main;
	}

	public void setMain(Main m_main) {
		this.m_main = m_main;
	}

	public Wind getWind() {
		return m_wind;
	}

	public void setWind(Wind m_wind) {
		this.m_wind = m_wind;
	}

	public List<WeatherCondition> getConditions() {
		return m_conditions;
	}

	public void setConditions(List<WeatherCondition> m_conditions) {
		this.m_conditions = m_conditions;
	}

	public int getCloudiness() {
		return m_cloudiness;
	}

	public void setCloudiness(int m_cloudiness) {
		this.m_cloudiness = m_cloudiness;
	}

	public Preciptation getPrecipitation() {
		return m_precipitation;
	}

	public void setPrecipitation(Preciptation m_precipitation) {
		this.m_precipitation = m_precipitation;
	}
	
	
	
}
