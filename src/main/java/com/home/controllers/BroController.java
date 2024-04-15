package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bro")
public class BroController {

	
	@RequestMapping("/cricketbat")
	public String getCricketBat() {
		return "MRFCricketBat";
	}
}
