package com.app.travel.spends.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.travel.spends.entities.Travels;
import com.app.travel.spends.servcie.TravelService;

@Controller
public class TravelController {

	@Autowired
	private TravelService travelServcie;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addTravel(@ModelAttribute("travel") Travels travel,
			BindingResult result) {

		travelServcie.create(travel);

		return "redirect:/index";
	}

	@RequestMapping("/index")
	public String listTravels(Map<String, Object> map) {

		map.put("travels", new Travels());
		map.put("TravelsList", travelServcie.listTravels());

		return "travels";
	}

}
