package it.betacom.ComputerFactory;

public class Notebook extends Computer{
	
	public Notebook() {
		super();
		this.HD = 0;
		this.CPU = 0;
		this.RAM = 0;
	}

	@Override
	void getRAM(int ram) {
		this.RAM = ram;
		
	}

	@Override
	void getHD(int hd) {
		this.HD = hd;
		
	}

	@Override
	void getCPU(double cpu) {
		this.CPU = cpu;
		
	}

}
