package it.betacom.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class MainScrivi {

	public static void main(String[] args) {   //come creare un file hardcoded
		String path = "./properties/prop.properties";
		OutputStream outputStream;
		try {
			outputStream = new FileOutputStream(path);
			Properties properties = new Properties();
			properties.setProperty("db.url", "192.168.1.43");
			properties.setProperty("utente", "Franchino");
			properties.store(outputStream, "file di proprieta'del db");	 
			System.out.println("Operazione conclusa");
		} 
		catch (FileNotFoundException e) {
			System.out.println("Errore: " + e.getMessage());
			
		} 
		catch (IOException e) {
			System.out.println("Errore: " + e.getMessage());
		}
	}

}
