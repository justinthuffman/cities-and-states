package org.wecancodeit.citiesandstates;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class CityPopulator implements CommandLineRunner {

	@Resource
	CityRepository cityRepo;

	@Resource
	StateRepository stateRepo;

	// public StateModel(String stateName, String abbreviation, String motto,
	// FishModel fish, String citiesUrl)

	FishModel walleye = new FishModel("Walleye");

	@Override
	public void run(String... args) throws Exception {
		StateModel ohio = new StateModel("Ohio", "OH", "With God, all things are possible", walleye,
				"/api/states/oh/cities");
		ohio = stateRepo.save(ohio);

		// public CityModel(Long id, String cityName, int population, state)

		CityModel columbus = new CityModel("Columbus", 879170, ohio);

		columbus = cityRepo.save(columbus);
	}
}
