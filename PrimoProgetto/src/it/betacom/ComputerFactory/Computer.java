package it.betacom.ComputerFactory;

public abstract class Computer {
	int HD, RAM;
	double CPU;
	abstract void getRAM(int ram);
	abstract void getHD(int hd);
	abstract void getCPU(double cpu);
	
	@Override
	public String toString() {
		return ("[RAM: " + this.RAM + " GB" + " HD: " + this.HD + " GB" + " CPU: " + this.CPU + " GHz" + " ]");
	}
}
