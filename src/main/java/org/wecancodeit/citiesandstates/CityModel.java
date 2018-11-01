package org.wecancodeit.citiesandstates;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CityModel {

	@Id
	@GeneratedValue
	private Long id;
	private String cityName;
	private int population;
// Prevents recursive state having cities-having a state-having cities-having a state...
	@JsonIgnore

	@ManyToOne
	private StateModel state;

	public CityModel() {
	}

	public CityModel(String cityName, int population, StateModel state) {
		super();
		this.cityName = cityName;
		this.population = population;
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public String getCityName() {
		return cityName;
	}

	public int getPopulation() {
		return population;
	}

}
