package it.betacom.main;


import it.betacom.model.Macchina;
import it.betacom.model.Veicolo;


public class MainVeicolo {

	public static void main(String[] args) {
		
		Veicolo veicolo = new Veicolo();
		veicolo.partenza();
		System.out.println(veicolo.getMarca());
		Macchina macchina = new Macchina();
		macchina.azionaFreno();
		macchina.partenza();
		System.out.println(macchina.getModel());
		
		Veicolo macchinaVeicolo = new Macchina(); //dichiarato come veicolo ma istanzianto come macchina --> polimorfismo e overloading
		macchinaVeicolo.getMarca(); // Non vedo gli attributi della classe macchina perchè macchinaVeicolo è di tipo Veicolo, quindi vedrò
									// solo gli attributi di Veicolo, ovvero marca.
	}

}
