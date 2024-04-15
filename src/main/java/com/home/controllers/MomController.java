package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mom")
public class MomController {

	@ResponseBody
	@RequestMapping("/sugar")
	public String getSugar() {
		return "Here.. is the sugar";
	}
}
