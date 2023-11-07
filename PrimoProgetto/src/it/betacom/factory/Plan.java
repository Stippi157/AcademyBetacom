package it.betacom.factory;

public abstract class Plan {
	protected double rate;
	public void calculateBill(int units) {
		System.out.println("Totale cost: " + units * rate);
	}
	abstract void getRate();
	
	public void setRate(double rate) {
		this.rate = rate;
	}
}
