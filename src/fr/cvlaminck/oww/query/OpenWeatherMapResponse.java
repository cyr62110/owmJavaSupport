package fr.cvlaminck.oww.query;

import java.util.ArrayList;
import java.util.List;

public class OpenWeatherMapResponse<T>
{
	private String m_message = null; //mandatory
	private int m_code; //mandatory
	private double m_calctime; //Can be null or empty
	private int m_count;
	private List<T> m_list;
	
	public OpenWeatherMapResponse()
	{
		m_list = new ArrayList<T>();
	}

	public String getMessage() {
		return m_message;
	}

	public void setMessage(String m_message) {
		this.m_message = m_message;
	}

	public int getCode() {
		return m_code;
	}

	public void setCode(int m_code) {
		this.m_code = m_code;
	}

	public double getCalctime() {
		return m_calctime;
	}

	public void setCalctime(double m_calctime) {
		this.m_calctime = m_calctime;
	}

	public int getCount() {
		return m_count;
	}

	public void setCount(int m_count) {
		this.m_count = m_count;
	}

	public List<T> getList() {
		return m_list;
	}

	public void setList(List<T> m_list) {
		this.m_list = m_list;
	}
	
}
