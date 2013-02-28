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
	
	
	
}
