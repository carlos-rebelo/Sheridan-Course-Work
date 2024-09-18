package ca.sheridancollege.rebeloca.beans;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Triangle");
	}
	
}
