package org.wecancodeit.citiesandstates;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CityController {

	@Resource
	public CityRepository cityRepo;

	@GetMapping("/")
	public String home() {
		return "state";
	}

//	@GetMapping("/city")
//	public String city() {
//		return "city";
//	}

}
