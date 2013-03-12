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

public class City {
	private int m_id;
	private String m_name = null;
	private Coord m_coord = null;
	private String m_country = null;
	private int m_population = 0;
	
	public City()
	{
	}

	public int getId() {
		return m_id;
	}

	public void setId(int id) {
		this.m_id = id;
	}

	public String getName() {
		return m_name;
	}

	public void setName(String name) {
		this.m_name = name;
	}

	public Coord getCoord() {
		return m_coord;
	}

	public void setCoord(Coord coord) {
		this.m_coord = coord;
	}


	public String getCountry() {
		return m_country;
	}

	public void setCountry(String country) {
		this.m_country = country;
	}

	public int getPopulation() {
		return m_population;
	}

	public void setPopulation(int population) {
		this.m_population = population;
	}


	public static class Coord {
		private double m_latitude;
		private double m_longitude;

		public Coord() {
		}

		public double getLatitude() {
			return m_latitude;
		}

		public void setLatitude(double latitude) {
			this.m_latitude = latitude;
		}

		public double getLongitude() {
			return m_longitude;
		}

		public void setLongitude(double longitude) {
			this.m_longitude = longitude;
		}

	}

}
