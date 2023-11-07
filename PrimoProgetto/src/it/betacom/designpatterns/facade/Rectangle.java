package it.betacom.designpatterns.facade;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Stai disegnando un rettangolo");
	}

}
