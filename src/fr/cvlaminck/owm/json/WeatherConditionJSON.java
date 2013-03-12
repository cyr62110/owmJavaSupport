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

import fr.cvlaminck.owm.model.WeatherCondition;

public class WeatherConditionJSON {
	
	public final static String WC_ID = "id";
	public final static String WC_MAIN = "main";
	public final static String WC_DESC = "description";
	public final static String WC_ICON = "icon";
	
	public static WeatherCondition weatherConditionFromWeatherJSON(JSONObject json) throws JSONException
	{
		WeatherCondition wc = new WeatherCondition();
		
		wc.setId(json.getInt(WC_ID));
		wc.setMain(json.getString(WC_MAIN));
		wc.setDescription(json.getString(WC_DESC));
		wc.setIcon(json.getString(WC_ICON));
		
		return wc;
	}

}
