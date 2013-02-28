package fr.cvlaminck.owm.model;

public class City {
	private int m_id;
	private String m_name = null;
	private Coord m_coord = null;
	private String m_country = null;
	private int m_population = 0;
	
	public City()
	{
	}

	public int getId() {
		return m_id;
	}

	public void setId(int id) {
		this.m_id = id;
	}

	public String getName() {
		return m_name;
	}

	public void setName(String name) {
		this.m_name = name;
	}

	public Coord getCoord() {
		return m_coord;
	}

	public void setCoord(Coord coord) {
		this.m_coord = coord;
	}


	public String getCountry() {
		return m_country;
	}

	public void setCountry(String country) {
		this.m_country = country;
	}

	public int getPopulation() {
		return m_population;
	}

	public void setPopulation(int population) {
		this.m_population = population;
	}


	public static class Coord {
		private double m_latitude;
		private double m_longitude;

		public Coord() {
		}

		public double getLatitude() {
			return m_latitude;
		}

		public void setLatitude(double latitude) {
			this.m_latitude = latitude;
		}

		public double getLongitude() {
			return m_longitude;
		}

		public void setLongitude(double longitude) {
			this.m_longitude = longitude;
		}

	}

}
