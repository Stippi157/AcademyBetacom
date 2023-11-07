package it.betacom.MainContrattoTelefonico;
import it.betacom.user.ContrattoFisso;
import it.betacom.user.ContrattoMobile;
import it.betacom.user.pdfHandler;


public class MainContrattoTelefonico {

	public static void main(String[] args) {
		ContrattoMobile contratto1 = new ContrattoMobile("Gianfranco", 371556428);
		ContrattoFisso contratto2 = new ContrattoFisso("Elisabetta", 339574865, "via le dita dal naso2");
	
//		for(int i= 0; i<10; i++ ) {
//			contratto1.aggiungiTelefonata();
//			contratto2.aggiungiTelefonata();
//		}
//		
//		contratto1.stampaTelefonate();
//		System.out.println(contratto1.getCostoTotale());
//		
//		contratto2.stampaTelefonate();
//		System.out.println(contratto2.getCostoTotale());
		
//		System.out.println(contratto1.getDatiUtente() + " " + contratto1.getCostoTotale());
//		System.out.println(contratto2.getDatiUtente() + " " + contratto2.getCostoTotale());
		
		pdfHandler pdf1 = new pdfHandler();
		pdf1.createPDF();
	}

}
