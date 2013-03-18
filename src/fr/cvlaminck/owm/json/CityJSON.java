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

package fr.cvlaminck.owm.json;

import org.json.JSONException;
import org.json.JSONObject;

import fr.cvlaminck.owm.model.City;
import fr.cvlaminck.owm.model.City.Coord;

public class CityJSON 
{
	public final static String CITY_ID = "id";
	public final static String CITY_NAME = "name";
	public final static String CITY_COUNTRY = "country";
	public final static String CITY_POPULATION = "pop";
	public final static String CITY_COORD="coord";
	public final static String CITY_DISTANCE = "distance";
	public final static String WEATHER_SYS = "sys";
	public final static String COORD_LATITUDE = "lat";
	public final static String COORD_LONGITUDE = "lon";
	
	public static City cityFromWeatherJSON(JSONObject json) throws JSONException
	{
		City city = new City();
		
		city.setId(json.getInt(CITY_ID));
		city.setName(json.getString(CITY_NAME));
		city.setCoord(coordFromJSON(json.getJSONObject(CITY_COORD)));
		if(json.has(CITY_DISTANCE))
			city.setDistance(json.getDouble(CITY_DISTANCE));
		//This part is optional and may not be always present
		if(json.has(WEATHER_SYS))
		{
			JSONObject sys = json.getJSONObject(WEATHER_SYS);
			if(sys.has(CITY_COUNTRY))
				city.setCountry(sys.getString(CITY_COUNTRY));
			if(sys.has(CITY_POPULATION))
				city.setPopulation(sys.getInt(CITY_POPULATION));
		}
		return city;
	}
	
	public static City.Coord coordFromJSON(JSONObject json) throws JSONException
	{
		City.Coord coord = new City.Coord();
		
		coord.setLatitude(json.getDouble(COORD_LATITUDE));
		coord.setLongitude(json.getDouble(COORD_LONGITUDE));
		
		return coord;
	}
}
