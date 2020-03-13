package de.woock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/energy")
public class EnergyController {

	@GetMapping("/level")
	public Long energyLevel() {
		return Long.valueOf(50);
	}
}
