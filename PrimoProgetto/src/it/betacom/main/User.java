package it.betacom.main;

public class User {
	
	private String nome, ruolo;
	
	public User(String nome, String ruolo){
		super();
		this.setNome(nome);
		this.setRuolo(ruolo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	@Override
	public String toString() {
		return "[" + nome + ", " + ruolo + " ]" ;
	}
}
