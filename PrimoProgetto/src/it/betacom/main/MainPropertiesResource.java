package it.betacom.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MainPropertiesResource {

	public static void main(String[] args) {
		String propertiesFile = "app.properties";
		InputStream inputStream = MainPropertiesResource.class.getClassLoader().getResourceAsStream(propertiesFile);
		try {
		
		if(inputStream == null) {
//			System.out.println("Errore caricamento file di properties");
//			return;
			throw new Exception("Errore caricamento file di properties");
		}
		
		Properties properties = new Properties();
			properties.load(inputStream);
			String utente = properties.getProperty("utente");
			String dbUrl = properties.getProperty("db.url");
			System.out.println("valori proprietà estratti: utente = " + utente + " db.url = " + dbUrl);
		}
		
		catch (IOException e) {
			System.out.println("ERRORE caricamento proprietà " + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
