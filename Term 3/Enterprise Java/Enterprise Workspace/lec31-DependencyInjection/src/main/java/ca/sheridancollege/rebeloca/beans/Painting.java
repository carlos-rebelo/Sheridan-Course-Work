package ca.sheridancollege.rebeloca.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Painting {
	Shape s;
	@Autowired
	Painting(Shape s) {
		this.s = s;
	}
	public void paint() {
		s.draw();
	}
}
