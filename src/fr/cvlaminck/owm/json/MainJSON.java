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
