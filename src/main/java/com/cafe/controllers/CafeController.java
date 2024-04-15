package com.cafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/cafe")
public class CafeController {

	@RequestMapping("/momscafe")
	public String showWelcomePage() {
		return "Cafe-Welcome-Page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request, Model model) {
		
		String value = request.getParameter("food_type");
		model.addAttribute("foodTypeValue", value);
		return "process-order";
		
	}
}
