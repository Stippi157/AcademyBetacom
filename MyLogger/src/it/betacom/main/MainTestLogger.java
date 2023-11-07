package it.betacom.main;

import java.time.LocalDate;
import java.util.Scanner;

import it.betacom.logger.MyLogger;

public class MainTestLogger {

	public static void main(String[] args) {
		MyLogger log = new MyLogger();
		
		
		log.info("messaggio di log");
		log.warning("Messaggio di avvertimento");
		log.error("Messaggio di errore");
		
		/*
		Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la tua data di nascita: "
        		+ "\nusa il formato yyyy-MM-dd ");
        try {
        	LocalDate dataDiNascita = LocalDate.parse(scanner.nextLine());
        } catch (Exception e) {
            log.logger("controllare la data " + e.getMessage());
            
        }
        */

	}

}
