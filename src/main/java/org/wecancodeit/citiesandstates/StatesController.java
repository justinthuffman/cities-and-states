package org.wecancodeit.citiesandstates;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatesController {

	@Resource
	private StateRepository stateRepo;

	@RequestMapping("/")
	public String ShowHome() {
		return "redirect:/states";
	}

	@GetMapping("/states")
	public String getStates(Model model) {
		model.addAttribute("states", stateRepo.findAll());
		return "states";
	}

	@GetMapping("/state/{id}")
	public String getStates(@PathVariable(value = "id") Long id, Model model) {
		System.out.println(stateRepo.findById(id));
		return "state";
	}

}
