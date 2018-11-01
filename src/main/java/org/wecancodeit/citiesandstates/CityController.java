package org.wecancodeit.citiesandstates;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cities")
public class CityController {

	@Resource
	public CityRepository cityRepo;

	@RequestMapping("/cities")
	public String home(Model model) {
		model.addAttribute("cities", cityRepo.findAll());
		return "cities";
	}

	@RequestMapping("/city/{id}")
	public String listCity(@PathVariable(value = "id") Long id, Model model) {
		model.addAttribute("city", cityRepo.findById(id).get());
		return "city";
	}

//	@RequestMapping("/")
//	public String ShowHome() {
//		return "redirect:/states";
//	}

}
