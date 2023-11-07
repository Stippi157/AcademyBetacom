package it.betacom.designpatterns.facade;

import java.util.logging.Logger;

public class FacadeDemoMain {
	
	
	private static final Logger logger = Logger.getLogger(FacadeDemoMain.class.getName());

	public static void main(String[] args) {
		
		logger.info("Inizio app");
		
		ShapeMaker shape = new ShapeMaker();
		shape.drawCircle();
		shape.drawRectangle();
		shape.drawSquare();
	}

}
