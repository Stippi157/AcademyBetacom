package it.betacom.model;

import java.util.Date;

public class Veicolo {
	String marca = "Fiat";
	
	public void partenza() {
		System.out.println("Il veicolo è partito");
	}
	
	public void partenza(Date date) {
		if (date == null) {
			this.partenza();
		}
		else {
			System.out.println("il veicolo si è avviato in data " + date);
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
