package it.betacom.user;

import java.time.LocalDate;

public class Telefonata {
	LocalDate date;
	int numeroTelefono;
	int durata;
	double costoTelefonata;
	
	public Telefonata(int numeroTelefono, int durata) {
		this.date = LocalDate.now();
		this.numeroTelefono = numeroTelefono;
		this.durata = durata;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public double getCostoTelefonata() {
		return costoTelefonata;
	}
	public void setCostoTelefonata(double costoTelefonata) {
		this.costoTelefonata = costoTelefonata;
	}
	

}
