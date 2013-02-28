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
	public final static String WEATHER_SYS = "sys";
	public final static String COORD_LATITUDE = "lat";
	public final static String COORD_LONGITUDE = "lon";
	
	public static City cityFromWeatherJSON(JSONObject json) throws JSONException
	{
		City city = new City();
		
		city.setId(json.getInt(CITY_ID));
		city.setName(json.getString(CITY_NAME));
		city.setCoord(coordFromJSON(json.getJSONObject(CITY_COORD)));
		//This part is optional and may not be always present
		JSONObject sys = json.getJSONObject(WEATHER_SYS);
		if(sys != null)
		{
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
