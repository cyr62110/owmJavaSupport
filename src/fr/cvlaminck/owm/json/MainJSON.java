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

import fr.cvlaminck.owm.model.Main;

public class MainJSON 
{
	public final static String MAIN_TEMP="temp";
	public final static String MAIN_PRESSURE="pressure";
	public final static String MAIN_HUMIDITY="humidity";
	public final static String MAIN_TEMP_MIN="temp_min";
	public final static String MAIN_TEMP_MAX="temp_max";
	
	public static Main mainFromWeatherJSON(JSONObject json) throws JSONException
	{
		Main main = new Main();
		
		main.setTemperature(json.getDouble(MAIN_TEMP));
		main.setPressure(json.getDouble(MAIN_PRESSURE));
		main.setHumidity(json.getDouble(MAIN_HUMIDITY));
		if(json.has(MAIN_TEMP_MIN))
			main.setTemperatureMin(json.getDouble(MAIN_TEMP_MIN));
		if(json.has(MAIN_TEMP_MAX))
			main.setTemperatureMax(json.getDouble(MAIN_TEMP_MAX));
		
		return main;
	}
	
}
