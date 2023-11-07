package it.betacom.designpatterns.facade;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Stai disegnando un cerchio");
	}
	
}
