package ca.sheridancollege.rebeloca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/") //localhost:8080
	public String goHome(Model model) {
		return "home";
	}
	@GetMapping("/testMe") //localhost:8080
	public String goTest(Model model) {
		return "third";
	}
}
