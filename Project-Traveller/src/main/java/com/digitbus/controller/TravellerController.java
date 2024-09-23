package com.digitbus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.digitbus.entity.Traveller;
import com.digitbus.service.ITravellerService;

@Controller
public class TravellerController {

	@Autowired
	private ITravellerService travellerService;

	@GetMapping("/")
	public String landingPageHandler() {
		return "index";
	}

	@GetMapping("/home")
	public String homePageHandler() {
		return "index";
	}

	// travellersignup
	@GetMapping("/travellersignup")
	public String travellersignupPageHandler() {
		return "travellersignup";
	}

	@PostMapping("/travellersignupProcess")
	public ModelAndView travellersignupsuccessPageHandler(@ModelAttribute("travelleReg") Traveller traveller) {
		travellerService.createTraveller(traveller);

		ModelAndView mav = new ModelAndView("travellersignupsuccess", "travellerkey", traveller);

		return mav;
	}

	// travellerlogin
	@GetMapping("/travellerlogin")
	public String travellerloginPageHandler() {
		return "travellerlogin";
	}

	@PostMapping("/travellerloginsuccess")
	public ModelAndView travellerloginsuccessPageHandler(@ModelAttribute("travelleLogin") Traveller traveller) {
		travellerService.showTravellerBybusNumberAndPassword(traveller.getBusNumber(), traveller.getPassword());
		ModelAndView mav = new ModelAndView("travellerloginsuccess", "travellerkey", traveller);
        return mav;
	}
	
	@PostMapping("/travellerloginerror")
	public ModelAndView travellerloginerrorPageHandler(@ModelAttribute("travelleLogin") Traveller traveller) {
		travellerService.showTravellerBybusNumberAndPassword(traveller.getBusNumber(), traveller.getPassword());
		ModelAndView mav = new ModelAndView("travellerloginerror", "travellerkey", traveller);
        return mav;
	}
	
	
	

	// showTraveller
	@GetMapping("/showtraveller")
	public ModelAndView showTravellers(@ModelAttribute("allTraveller") Traveller traveller) {
		List<Traveller> retriveTraveller = travellerService.retriveTraveller();
		ModelAndView mav = new ModelAndView("showtraveller", "travellers", retriveTraveller);
		return mav;
	}

}
