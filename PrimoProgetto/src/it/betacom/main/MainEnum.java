package it.betacom.main;

import it.betacom.model.Giorni;

public class MainEnum {

	enum GiornidellaSettimana {lunedi, martedi, mercoledi, giovedì};
	
	public static void main(String[] args) {
		
		Giorni giorno;
		giorno = Giorni.MERCOLEDI;
		System.out.println(giorno);
		
		switch (giorno) {
		case LUNEDI:
			break;
		case MARTEDI:
			break;
		case MERCOLEDI:
			break;
		case GIOVEDI:
			break;
		case VENERDI:
			break;
		}
		

	}

}
