package com.example.ThymleafExample.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Hello {
	
	@RequestMapping(path = "/home",method = RequestMethod.GET)
	public String home(Model m) {
		m.addAttribute("name","Oli Chowdhury Ganguly");

		return "home";
	}
}
