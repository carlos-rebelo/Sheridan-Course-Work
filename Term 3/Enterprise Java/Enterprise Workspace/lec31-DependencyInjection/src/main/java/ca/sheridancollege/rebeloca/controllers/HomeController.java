package ca.sheridancollege.rebeloca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ca.sheridancollege.rebeloca.beans.Painting;


@Controller
public class HomeController {
	final Painting p;
	HomeController(Painting p) {
	this.p = p;
	}
	@Autowired
	@GetMapping("/paint")
	public String paint() {
	p.paint();
	return "paintingComplete";
	}
	
}
