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

import java.util.ArrayList;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import fr.cvlaminck.owm.model.Weather;
import fr.cvlaminck.owm.model.WeatherCondition;

public class WeatherJSON 
{
	public final static String WEATHER_DATE = "dt";
	public final static String WEATHER_MAIN = "main";
	public final static String WEATHER_WIND = "wind";
	public final static String WEATHER_CONDITIONS = "weather";
	//TODO: Precipiations are not included in this version
	
	public Weather weatherFromWeatherJSON(String jsonString) throws JSONException
	{
		JSONObject json = new JSONObject(jsonString);
		
		Weather weather = new Weather();
		
		weather.setCity(CityJSON.cityFromWeatherJSON(json));
		weather.setDate(new Date(json.getInt(WEATHER_DATE)));
		weather.setMain(MainJSON.mainFromWeatherJSON(json.getJSONObject(WEATHER_MAIN)));
		weather.setWind(WindJSON.windFromWeatherJSON(json.getJSONObject(WEATHER_WIND)));
		
		ArrayList<WeatherCondition> wcs = new ArrayList<WeatherCondition>();
		JSONArray array = json.getJSONArray(WEATHER_CONDITIONS);
		for(int i = 0; i < array.length(); i++)
		{
			JSONObject jsonWC = array.getJSONObject(i);
			wcs.add(WeatherConditionJSON.weatherConditionFromWeatherJSON(jsonWC));
		}
		weather.setConditions(wcs);
		
		return weather;
	}
	
}
