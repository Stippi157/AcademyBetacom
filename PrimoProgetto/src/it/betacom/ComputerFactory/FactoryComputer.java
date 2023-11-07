package it.betacom.ComputerFactory;

public class FactoryComputer {
	public Computer getComputer(String computerType) {
		if (computerType.equals("Notebook")) {
			return new Notebook();
		}
		else if (computerType.equals("Server")) {
			Computer server = new Server();
			return server;
		}
		else if(computerType.equals("Desktop")) {
			return new Desktop();
		}
		return null;
	}
}
