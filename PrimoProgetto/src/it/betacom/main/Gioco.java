//package it.betacom.main;
//import it.betacom.model.*;
//import java.util.*;
//
//public class Gioco {
//	
//	private List<Persona> giocatori;
//	
//	public Gioco() {
//		this.giocatori = new ArrayList<Persona>(3);
//	}
//
//	public void aggiungiGiocatori() {
//		int dimensione = giocatori.size();
//		System.out.println(dimensione);
//			for (int i = 0; i<dimensione; i++) {
//				Scanner sc = new Scanner(System.in);
//				Persona giocatore = new Persona();
//				System.out.println("Inserire il nome del giocatore n^ " + i+1);
//				giocatore.setNome(sc.nextLine());;
//				giocatori.add(giocatore);
//				sc.close();
//		}
//	}
//	
//	
//	public void partita() {
//		
//		Dado dado = new Dado();
//		for(int i = 0; i<giocatori.size()-1; i++) {
//			giocatori.get(i).setNumero(dado.lancioMultiplo());
//		}
//	}
//	
//	public void determinaVincitore() {
//			
//			for(int i = 0; i< giocatori.size()-1; i++) {
//				controlla();
//			}
//	}
//	public int massimo(){
//		
//		int max = 0;
//		for(Persona p : giocatori) {
//			if( p.getNumero() > max) {
//				max = p.getNumero();
//			}
//			
//		}
//		return max;
//	}
//	
//	public void controlla() {
//		int n = massimo();
//		int c = 0;
//		
//		for(Persona p : giocatori) {
//			if(p.getNumero() == n) {
//				c++;
//				if (c>1) {
//					System.out.println("La partita è finita in parità");
//					break;
//				}
//			}			
//		}
//	}
//}
