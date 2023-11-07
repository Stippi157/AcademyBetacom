package it.betacom.designpatterns.facade;

public class ShapeMaker {
	
	private Circle circle;
	private Rectangle rectangle;
	private Square square;
	
	public ShapeMaker() {
		super();
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
	public void drawSquare() {
		square.draw();
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	public Square getSquare() {
		return square;
	}
	public void setSquare(Square square) {
		this.square = square;
	}
}
