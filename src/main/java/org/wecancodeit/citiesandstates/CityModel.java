package org.wecancodeit.citiesandstates;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CityModel {

	@Id
	@GeneratedValue
	private Long id;
	private String cityName;
	private String stateName;
	private int population;

	@ManyToOne
	private CityModel city;

	public CityModel() {
	}

	public CityModel(Long id, String cityName, String stateName, int population) {
		this.id = id;
		this.cityName = cityName;
		this.stateName = stateName;
		this.population = population;
	}

	public Long getId() {
		return id;
	}

	public String getCityName() {
		return cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public int getPopulation() {
		return population;
	}

	public CityModel getCity() {
		return city;
	}

}
