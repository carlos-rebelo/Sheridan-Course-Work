package ca.sheridancollege.rebeloca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String goIndex() {
		return "index";
	}
	@GetMapping("/hairColour")
	public String goHair() {
		return "hairColour";
	}
	@GetMapping("/fontHeight")
	public String goHeight() {
		return "fontHeight";
	}
	@GetMapping("/name")
	public String goName() {
		return "name";
	}
	

}
