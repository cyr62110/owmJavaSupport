package fr.cvlaminck.owm.model;

public class Wind 
{
	private double m_speed;
	private double m_degree;
	private double m_gust = Double.MIN_VALUE;
	
	public Wind()
	{
	}

	public double getSpeed() {
		return m_speed;
	}

	public void setSpeed(double speed) {
		this.m_speed = speed;
	}

	public double getDegree() {
		return m_degree;
	}

	public void setDegree(double degree) {
		this.m_degree = degree;
	}
	
	public boolean hasGust() {
		return m_gust != Double.MIN_VALUE;
	}

	public double getGust() {
		return m_gust;
	}

	public void setGust(double gust) {
		this.m_gust = gust;
	}
}
