package it.betacom.model;

public class Persona {
	public Persona() {
		
	}
	
	public Persona(String nome, String cognome, String nazionalità) {
		this.nome = nome;
		this.cognome = cognome;
		this.nazionalità = nazionalità;
	}

	private String nome, cognome, nazionalità;	
	 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNazionalità() {
		return nazionalità;
	}

	public void setNazionalità(String nazionalità) {
		this.nazionalità = nazionalità;
	}

	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", nazionalità=" + nazionalità + "]";
	}
	
	
}
