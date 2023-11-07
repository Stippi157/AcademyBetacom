//package it.betacom.main;
//
//import java.util.*;
//
//import org.apache.commons.lang3.StringUtils;
//
//import it.betacom.model.Persona;
//
//public class Prima {
//
//	public static void main(String[] args) {
//		System.out.println("Benvenuto " + args[0] + " " + args[1] + " di nazionalità " + args[2] + " in Academy!");
//
//		Persona persona = new Persona(args[0], args[1], args[2]);
//		String nome = "Matteo    ";
//		System.out.println(StringUtils.trim(nome));
//		
//
//		/*
//		 * persona.nome = args[0]; persona.cognome = args[1]; persona.nazionalità =
//		 * args[2];
//		 * 
//		 * System.out.println("Persona: " + persona.nome + " " + persona.cognome + " " +
//		 * persona.nazionalità);
//		 */
//
////		persona.setNome(args[0]);
////		persona.setCognome(args[1]);
////		persona.setNazionalità(args[2]);
//
//		System.out.println(persona.toString());
//		
//		for (int i = 0; i<10; i++) {
//			if(i==4) {
//				break;                //continue stampa tutti tranne 4 perchè salta l'istruzione successiva
//									  //break stampa da 0 a 3 incluso poi esce dal ciclo
//			}
//			System.out.println(i);
//		}
//		
//		String[] cars = {"Fiat", "BMW", "Ford", "Toyota"};
//		
//		for (String car: cars) {
//			System.out.println(car);
//		}
//		
//		List<Persona> lista = new ArrayList<Persona>();
//		lista.add(persona);
//		
//	}
//	
//}