package fr.cvlaminck.owm.model;

public abstract class Preciptation 
{
	private double m_volumePer3h;
	
	public Preciptation()
	{
	}

	public abstract String getType();
	
	public double geVolumePer3h() {
		return m_volumePer3h;
	}

	public void setVolumePer3h(double volumePer3h) {
		this.m_volumePer3h = volumePer3h;
	}
}
