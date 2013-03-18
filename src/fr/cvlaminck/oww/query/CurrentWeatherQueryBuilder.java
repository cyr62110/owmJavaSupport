package fr.cvlaminck.oww.query;

public class CurrentWeatherQueryBuilder extends OpenWeatherMapQueryBuilder 
{
	public static enum Type
	{
		CITY("city"),
		STATION("station");
		
		private String m_type;
		Type(String t){m_type = t;}
		public String toString(){ return m_type; }
	}
	
	public final static String QUERY_BASE = "http://api.openweathermap.org/data/2.1/";
	//
	public Type m_elementType = null;
	//Using Id
	public Long m_id = null;
	//Using Arround a point
	public final static String LATITUDE = "lat";
	public Double m_latitude = null;
	public final static String LONGITUDE = "lon";
	public Double m_longitude = null;
	public final static String COUNT = "cnt";
	public Integer m_count = null;
	//Using a bounding box
	//TODO
	//Using a bounding radius
	public final static String RADIUS = "radius";
	public Integer m_radius = null;
	//Using name
	public final static String NAME = "q";
	public String m_name = null;
	public final static String TYPE = "type";
	public String m_type = null;
	//units ... not supported
	//General
	public final static String CALLBACK = "callback";
	public String m_callback = null;
	public final static String CLUSTER = "cluster";
	public Boolean m_cluster = null;
	public final static String LANG = "lang";
	public String m_lang = null;
	
	public CurrentWeatherQueryBuilder(Type type ,String encodingScheme)
	{
		super(encodingScheme);
		m_elementType = type;
	}
	
	public CurrentWeatherQueryBuilder(String encodingScheme)
	{
		this(Type.CITY, encodingScheme);
	}
	
	public CurrentWeatherQueryBuilder id(long id)
	{
		m_id = Long.valueOf(id);
		return this;
	}
	
	public CurrentWeatherQueryBuilder latitude(double lat)
	{
		m_latitude = Double.valueOf(lat);
		return this;
	}
	
	public CurrentWeatherQueryBuilder longitude(double lng)
	{
		m_longitude = Double.valueOf(lng);
		return this;
	}
	
	public CurrentWeatherQueryBuilder count(int count)
	{
		m_count = Integer.valueOf(count);
		return this;
	}
	
	public CurrentWeatherQueryBuilder radius(int radius)
	{
		m_radius = Integer.valueOf(radius);
		return this;
	}
	
	public CurrentWeatherQueryBuilder name(String name)
	{
		m_name = name;
		return this;
	}
	
	public CurrentWeatherQueryBuilder like(boolean like)
	{
		m_type = (like)?"like":null;
		return this;
	}
	
	public CurrentWeatherQueryBuilder callback(String callback)
	{
		m_callback = callback;
		return this;
	}
	
	public CurrentWeatherQueryBuilder cluster(boolean cluster)
	{
		m_cluster = Boolean.valueOf(cluster);
		return this;
	}
	
	public CurrentWeatherQueryBuilder lang(String lang)
	{
		m_lang = lang;
		return this;
	}
	
	@Override
	public String build() {
		StringBuilder query = new StringBuilder(QUERY_BASE);
		StringBuilder parameters = new StringBuilder();
		
		if(m_id != null)
		{
			//We are using ids to find our city
			query.append("weather/").append(m_type.toString()).append("/").append(m_id.doubleValue());
		}
		else if(m_name != null)
		{
			//We are using city name as keyword
			query.append("find/name");
			addParameter(parameters, NAME, m_name);
			addParameter(parameters, TYPE, m_type);
		}
		else
		{
			query.append("find/city");
			
			addParameter(parameters, LATITUDE, m_latitude);
			addParameter(parameters, LONGITUDE, m_longitude);
			addParameter(parameters, COUNT, m_count);
			addParameter(parameters, RADIUS, m_radius);
			addParameter(parameters, CALLBACK, m_callback);
			addParameter(parameters, CLUSTER, m_cluster);
			addParameter(parameters, LANG, m_lang);
		}
		
		if(parameters.length() > 0)
			query.append("?").append(parameters);
		return query.toString();
	}
	
	
}
