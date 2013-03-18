package fr.cvlaminck.owm.json;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import fr.cvlaminck.owm.model.Weather;
import fr.cvlaminck.oww.query.OpenWeatherMapResponse;

public class ResponseJSON 
{
	public final static String MESSAGE = "message";
	public final static String CODE = "cod";
	public final static String CALCTIME = "calctime";
	public final static String COUNT = "cnt";
	public final static String LIST = "list";
	
	public static OpenWeatherMapResponse<Weather> responseFromCurrentWeatherJSON(JSONObject json) throws JSONException
	{
		OpenWeatherMapResponse<Weather> response = new OpenWeatherMapResponse<Weather>();
		
		response.setMessage(json.getString(MESSAGE));
		response.setCode(json.getInt(CODE));
		if(json.has(CALCTIME) && json.getString(CALCTIME).length() > 0)
			response.setCalctime(json.getDouble(CALCTIME));
		if(json.has(COUNT))
			response.setCount(json.getInt(COUNT));
		if(json.has(LIST))
		{
			JSONArray array = json.getJSONArray(LIST);
			List<Weather> weathers = new ArrayList<Weather>();
			for(int i = 0; i < array.length(); i++)
			{
				weathers.add(WeatherJSON.weatherFromWeatherJSON(array.getJSONObject(i)));
			}
			response.setList(weathers);
		}
		
		return response;
	}

}
