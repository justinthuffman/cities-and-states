package org.wecancodeit.citiesandstates;

import javax.persistence.Embeddable;

@Embeddable
public class FishModel {

	private String fishName;

	public FishModel() {
	}

	public FishModel(String fishName) {
		this.fishName = fishName;

	}

	public String getFishName() {
		return fishName;
	}
}
