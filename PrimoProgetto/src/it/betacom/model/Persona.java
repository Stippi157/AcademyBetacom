package it.betacom.model;

public class Persona {
	
	private String nome, cognome;
	
	public Persona() {
		
	}
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;

	}

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

	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + " ]";
	}

}
