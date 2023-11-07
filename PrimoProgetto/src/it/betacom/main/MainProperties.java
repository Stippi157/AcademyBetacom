package it.betacom.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import Util.Utils;

import java.util.*;

public class MainProperties {

	public static void main(String[] args) {
		String path = "./properties/config.properties";
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(path);
			
			Properties properties = Utils.caricaProprieta(inputStream);
//			properties.load(inputStream);   //questo metodo genera IOException
			String utente = properties.getProperty("utente");
			String dbUrl = properties.getProperty("db.url");
			System.out.println("Valori proprietà estratte: utente: " + utente + " dbUrl: " + dbUrl);
			
			Enumeration<?> e = properties.propertyNames();
	        while (e.hasMoreElements()) {
	        	String key = (String) e.nextElement();
	        	String value = properties.getProperty(key);
	        	System.out.println("chiave : " + key + ", valore : " + value);
	        	}
	        	
	        	
	        properties.forEach((key, value) -> System.out.println("Key : " + key + ", Value : " + value));  	
	        
	        properties.keySet().forEach(x -> System.out.println(x));
		} 
		
		catch (FileNotFoundException e) {
			System.out.println("File non trovato " + e.getMessage());
		} 
		
		catch (IOException e) {
			System.out.println("Errore caricamento dati da file " + path + " " + e.getMessage());;
		}
	}
}
