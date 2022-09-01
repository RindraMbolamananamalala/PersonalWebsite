package com.rindraibi.website.presentation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * The class dedicated to the definition any Controller related to the general functioning
 * of the whole WebSite. 
 * @author Rindra Mbolamananamalala
 *
 */
@RestController
public class WebsiteController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	/**
	 * 
	 * @return Redirection to the Website Homepage.
	 */
	public ModelAndView redirectToHomePage(){
		return new ModelAndView("redirect:/index.html");
	}
}
