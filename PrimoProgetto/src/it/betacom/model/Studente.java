package it.betacom.model;

public class Studente extends Persona {
	public int calcolaMediaVoti(int sommaVoti, int numExam) {
		return sommaVoti/numExam;
	}
}
