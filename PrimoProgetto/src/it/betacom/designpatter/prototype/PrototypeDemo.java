package it.betacom.designpatter.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		EmployeeRecord employee1 = new EmployeeRecord(102, "Antonio", "Villafranca", "via leditaDalNaso 666", 4000);
		employee1.showRecord();
		
		EmployeeRecord employee2 = (EmployeeRecord) employee1.getClone();
		employee2.setName("Franco");
		employee2.showRecord();
	}

}
