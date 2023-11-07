package it.betacom.contoBancario;

import java.time.LocalDate;

public class Movimento {
	private LocalDate dataMovimento;
	private int resoconto;
	
	public Movimento() {
		super();
		this.resoconto = 0;
		this.dataMovimento = UtilsConto.generaData();
	}

	public int getResoconto() {
		return resoconto;
	}

	public void setResoconto(int resoconto) {
		this.resoconto = resoconto;
	}

	public LocalDate getDataMovimento() {
		return dataMovimento;
	}

	public void setDataMovimento(LocalDate dataMovimento) {
		this.dataMovimento = dataMovimento;
	}
	
}
