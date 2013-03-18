package fr.cvlaminck.oww.query;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public abstract class OpenWeatherMapQueryBuilder 
{
	public final static String URL_ENCODING_SCHEME = "utf-8";
	
	private String m_urlEncodingScheme = URL_ENCODING_SCHEME;
	
	public OpenWeatherMapQueryBuilder(String urlEncodingScheme)
	{
		m_urlEncodingScheme = urlEncodingScheme;
	}
	
	public void setEncodingScheme(String es)
	{
		m_urlEncodingScheme = es;
	}
	
	public String getEncodingScheme()
	{
		return m_urlEncodingScheme;
	}
	
	public abstract String build();
	
	protected void addParameter(StringBuilder parameters, String key, Object value)
	{
		if(key == null || value == null || parameters == null)
			return;
		try
		{
			if(parameters.length() != 0)
				parameters.append('&');
			parameters.append(key + "=" + URLEncoder.encode(parameterValue(value), m_urlEncodingScheme));
		} catch (UnsupportedEncodingException e) {
			return;
		}
	}
	
	private String parameterValue(Object value)
	{
		if(value == null)
			return null;
		if(value.getClass() == String.class)
			return (String)value;
		else if(value.getClass() == Boolean.class)
			return ((Boolean)value).booleanValue()?"yes":"no";
		else if(value.getClass() == List.class)
		{
			@SuppressWarnings("unchecked")
			List<String> values = (List<String>)value;
			StringBuilder sb = new StringBuilder();
			int count = 0;
			for(String s : values)
			{
				if(count != 0)
					sb.append(',');
				sb.append(s);
				count ++;
			}
			return sb.toString();
		}
		else
			return value.toString();
	}
	
}
