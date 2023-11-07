package it.betacom.main;

import it.betacom.anonymous.Calcolatrice;
import it.betacom.anonymous.MyLogger;

public class MainAnonymousClass {

	public static void main(String[] args) {
        final MyLogger myLogger = new MyLogger();
        myLogger.info("Start main method");

        Calcolatrice c = new Calcolatrice();
        myLogger.info("L'operazione è uguale a: " + c.somma(10, 5));


        Calcolatrice c2 = new Calcolatrice() {

            // Riscrivo il metodo definito nella classe Calcolatrice
            // andando ad aggiungerci le sue caratteristiche
            public String somma(int a, int b) {
                if (b == 0)
                    myLogger.warning("Il numero sommato e' zero. Operazione inutile");
                String messaggio = "La somma di " + a + " e " + b + " = ";
                return messaggio + (a + b);

            }
        };
        myLogger.info("Marca = " + c2.hashCode() + "L'operazione ");
        Calcolatrice c3 = new Calcolatrice() {

            public String somma(int a, int b) {
                if (b == 0)
                    myLogger.warning("Il numero sommato e' zero. Operazione inutile");
                String messaggio = "La somma di " + a + " e " + b + " = ";
                return messaggio + (a + b);

            }

            public int dividi(int a, int b) {
                int c = 0;
                try {
                    c = a / b;
                } catch (Exception e) {
                    myLogger.error("Errore " + e.getMessage());
                    e.printStackTrace();
                }
                return c;

            }
        };
        myLogger.info(Integer.toString(c3.dividi(4, 2)));


    }

}