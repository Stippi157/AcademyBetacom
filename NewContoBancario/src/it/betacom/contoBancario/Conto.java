package it.betacom.contoBancario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Conto {
	
	private String titolare;
	private LocalDate dataAperturaConto;
	private int saldo;
	List<Movimento> movimenti = new ArrayList<Movimento>();
	
	public Conto(String titolare) {
		this.titolare = titolare;
		this.dataAperturaConto = LocalDate.of(02, 03, 2021);
		this.saldo = 1000;
	}
	public abstract void generaInteressi();
	
	public void prelievo(int prelievo) {
		int resoconto = 0;
		this.saldo -= prelievo;
		resoconto = saldo;
		Movimento movimento = new Movimento();
		movimento.setResoconto(resoconto);
		movimenti.add(movimento);
		
	}
	public void versamento(int versamento) {
		int resoconto = 0;
		this.saldo += versamento;
		resoconto = saldo;
		Movimento movimento = new Movimento();
		movimento.setResoconto(resoconto);
		movimenti.add(movimento);
	}
	public String getTitolare() {
		return titolare;
	}
	public void setTitolare(String titolare) {
		this.titolare = titolare;
	}
	public LocalDate getDataAperturaConto() {
		return dataAperturaConto;
	}
	public void setDataAperturaConto(LocalDate dataAperturaConto) {
		this.dataAperturaConto = dataAperturaConto;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public List<Movimento> getMovimenti() {
		return movimenti;
	}
	public void setMovimenti(ArrayList<Movimento> movimenti) {
		this.movimenti = movimenti;
	}
}
