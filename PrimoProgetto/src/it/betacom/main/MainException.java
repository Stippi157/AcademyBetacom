package it.betacom.main;

import Util.Utils;
import it.betacom.model.Studente;

public class MainException {

	public static void main(String[] args) {
		
		try {
			
			Studente studente = new Studente();
			studente.calcolaMediaVoti(10, 0);
			
			System.out.println("Benvenuto " + args[0] + " !");
			System.out.println("Il risultato è : " + Utils.dividi(8 , 2));
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ERRORE: Non hai inserito il tuo nome!!");
			e.getMessage();
		} catch (ArithmeticException e) {
				System.out.println("ERRORE: hai eseguito una divisione per zero!!");
				e.getMessage();
			}

	}

}
