package it.betacom.model;

public class Macchina extends Veicolo {
	
	protected String model = "Panda";
	
	public void partenza() {
		this.avviaMotore();									//	polimorfismo --> cambio il metodo in qualcosa di specifico per l'oggetto della 
			System.out.println("Il veicolo si è avviato");		// classe Macchina che estende veicolo
	}
	public void avviaMotore() {
		System.out.println("Motore avviato");
	}
	
	public void azionaFreno() {
		System.out.println("Ho azionato il freno a mano");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
