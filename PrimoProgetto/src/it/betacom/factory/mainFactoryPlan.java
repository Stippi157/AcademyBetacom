package it.betacom.factory;

public class mainFactoryPlan {

	public static void main(String[] args) {
		
		
		PlanFactory planFactory = new PlanFactory();
		Plan domesticPlan = planFactory.getPlan("domestic");
		domesticPlan.getRate();
		domesticPlan.calculateBill(10);
		
		PlanFactory planFactory2 = new PlanFactory();
		Plan istitutional = planFactory2.getPlan("istitutional");
		istitutional.getRate();
		istitutional.calculateBill(3);

	}

}
