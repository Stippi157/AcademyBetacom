package it.betacom.factory;

public class PlanFactory {
	public Plan getPlan(String planType) {
		
		if (planType.equals("domestic")) {
			DomesticPlan domestic = new DomesticPlan();
			return domestic;
		}
		else if (planType.equals("commercial")) {
			CommercialPlan commercial = new CommercialPlan();
			return commercial;
		}
		else if(planType.equals("istitutional")) {
			return new IstitutionalPlan();               //scrittura compatta
		}
		return null;
	} 
}
