package com.sharetown.edu;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/", "home"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		//String formattedDate = dateFormat.format(date);
		model.addAttribute("title", "home page");
		
		model.addAttribute("userClickHome", true);
		
		return "home";
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Locale locale, Model model) {
		
		//String formattedDate = dateFormat.format(date);
		model.addAttribute("title", "about page");
		
		model.addAttribute("userClickAbout", true);
		
		return "home";
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contact(Locale locale, Model model) {
		
		//String formattedDate = dateFormat.format(date);
		model.addAttribute("title", "contact page");
		
		model.addAttribute("userClickContact", true);
		
		return "home";
	}
	
	@RequestMapping(value = "/courses", method = RequestMethod.GET)
	public String courses(Locale locale, Model model) {
		
		//String formattedDate = dateFormat.format(date);
		model.addAttribute("title", "courses page");
		
		model.addAttribute("userClickCourses", true);
		
		return "home";
	}
	
	@RequestMapping(value = "/elements", method = RequestMethod.GET)
	public String elements(Locale locale, Model model) {
		
		//String formattedDate = dateFormat.format(date);
		model.addAttribute("title", "elements page");
		
		model.addAttribute("userClickElements", true);
		
		return "home";
	}
	
	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public String news(Locale locale, Model model) {
		
		//String formattedDate = dateFormat.format(date);
		model.addAttribute("title", "news page");
		
		model.addAttribute("userClickNews", true);
		
		return "home";
	}
	
}
