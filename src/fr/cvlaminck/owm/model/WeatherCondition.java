package fr.cvlaminck.owm.model;

public class WeatherCondition 
{
	private int m_id;
	private String m_main;
	private String m_description;
	private String m_icon;
	
	public WeatherCondition()
	{
	}

	public int getId() {
		return m_id;
	}

	public void setId(int m_id) {
		this.m_id = m_id;
	}

	public String getMain() {
		return m_main;
	}

	public void setMain(String main) {
		this.m_main = main;
	}

	public String getDescription() {
		return m_description;
	}

	public void setDescription(String description) {
		this.m_description = description;
	}

	public String getIcon() {
		return m_icon;
	}

	public void setIcon(String icon) {
		this.m_icon = icon;
	}
	
	
}
