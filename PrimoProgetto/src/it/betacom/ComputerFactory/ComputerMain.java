package it.betacom.ComputerFactory;

public class ComputerMain {

	public static void main(String[] args) {
		FactoryComputer factoryComputer = new FactoryComputer();
		Computer Notebook = factoryComputer.getComputer("Notebook");
		Notebook.getHD(500);
		Notebook.getCPU(2.4);
		Notebook.getRAM(8);
		System.out.println(Notebook.toString());
		FactoryComputer factoryComputer2 = new FactoryComputer();
		Computer Server = factoryComputer2.getComputer("Server");
		Server.getCPU(5.2);
		Server.getHD(2000);
		Server.getRAM(8);
		if(Server.RAM<=16) {
			Server.RAM += 16;
		}
		System.out.println(Server.toString());
	}

}
