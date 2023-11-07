package it.betacom.user;

public class ContrattoMobile extends ContrattoTelefonico {
	
	private static final double scattoAllaRisposta = 1.5;

	public ContrattoMobile(String nome, int numeroTelefono) {
		super(nome, numeroTelefono);
	}
	
//	public void aggiornaBolletta(int secondi) {
//		super.costoTelefonata(secondi);
//		super.costoTelefonata(scattoAllaRisposta);
//	}
}
