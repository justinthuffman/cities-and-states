package org.wecancodeit.citiesandstates;

import java.util.Collection;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StateModel {

	@Id
	@GeneratedValue
	private Long id;
	private String stateName;
	private String motto;
	private String abbreviation;
	private String citiesUrl;
	@Embedded
	private FishModel fish;

	@OneToMany(mappedBy = "state")
	private Collection<CityModel> cities;

	public StateModel() {
	}

	public StateModel(String stateName, String abbreviation, String motto, FishModel fish, String citiesUrl) {
//		super();
		this.stateName = stateName;
		this.abbreviation = abbreviation;
		this.motto = motto;
		this.fish = fish;
		this.citiesUrl = citiesUrl;
	}

	public Long getId() {
		return id;
	}

	public String getStateName() {
		return stateName;
	}

	public String getMotto() {
		return motto;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public FishModel getFish() {
		return fish;
	}

	public String getCitiesUrl() {
		return citiesUrl;
	}

	public Collection<CityModel> getCities() {
		return cities;
	}
}
