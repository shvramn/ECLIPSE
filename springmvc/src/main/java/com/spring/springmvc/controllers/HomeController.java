package com.spring.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value ="/home", method = RequestMethod.GET)
	public ModelAndView HomepageMethod()
	{
		ModelAndView model = new ModelAndView("home"); 
		model.addObject("java", "springboot");
		model.addObject("course", "springmvc");
		
		return model;
	}

}
