package it.betacom.main;

import it.betacom.model.Persona;

public class Prima {

	public static void main(String[] args) {
		System.out.println("Benvenuto " + args[0] + " " + args[1] + " di nazionalità " + args[2] + " in Academy!");

		Persona persona = new Persona(args[0], args[1], args[2]);

		/*
		 * persona.nome = args[0]; persona.cognome = args[1]; persona.nazionalità =
		 * args[2];
		 * 
		 * System.out.println("Persona: " + persona.nome + " " + persona.cognome + " " +
		 * persona.nazionalità);
		 */

//		persona.setNome(args[0]);
//		persona.setCognome(args[1]);
//		persona.setNazionalità(args[2]);

		System.out.println(persona.toString());

	}
}