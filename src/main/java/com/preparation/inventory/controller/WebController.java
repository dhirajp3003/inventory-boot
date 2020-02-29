package com.preparation.inventory.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

	@RequestMapping(value = "/" ,method = RequestMethod.GET)
	public String forward() {
		return "index.html";
	}
	
	@RequestMapping(value = "/test" ,method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "Hello";
	}
}
