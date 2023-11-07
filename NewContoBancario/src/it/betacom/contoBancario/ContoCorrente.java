package it.betacom.contoBancario;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class ContoCorrente extends Conto {
	
	public ContoCorrente(String titolare) {
		super(titolare);
		// TODO Auto-generated constructor stub
	}

	private static final double tassoDiInteresse = 0.07;

	@Override
	public void generaInteressi() {
		
		
	}
	public long calcolaPeriodo(ArrayList<Movimento> movimenti) {
		
		LocalDate temp;
		LocalDate inizio;
		LocalDate fine;
		long diffInDays = 0;
		for(int i = 0; i<movimenti.size(); i++) {
			inizio = getDataAperturaConto();
			fine = movimenti.get(i).getDataMovimento();
			diffInDays = ChronoUnit.DAYS.between(inizio, fine);
			temp = fine;
			fine = movimenti.get(i+1).getDataMovimento();
			inizio = temp;
		}
		
		return diffInDays;
		
	}
	
}
