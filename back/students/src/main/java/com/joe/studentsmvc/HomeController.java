package com.joe.studentsmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String goHome(Model model) {
		model.addAttribute("title", "Students Project");
		
		return "index";
	}

}
