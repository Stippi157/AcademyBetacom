package it.betacom.main;

public class Dado {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int lancio() {
		return numero = (int) (Math.random()*6 + 1);
	}
	public int lancioMultiplo() {
		return lancio() + lancio();
	}

}
