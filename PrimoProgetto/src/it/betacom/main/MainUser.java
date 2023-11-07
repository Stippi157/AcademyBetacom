package it.betacom.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainUser {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		User user;
		
		user = new User("Paolo", "admin");
		users.add(user);
		user = new User("Luigi", "member");
		users.add(user);
		user = new User("Luca", "member");
		users.add(user);
		user = new User("Andrea", "admin");
		users.add(user);
		user = new User("Marco", "member");
		users.add(user);
		
		
		ArrayList<User> admins = new ArrayList<User>();
		ArrayList<User> members = new ArrayList<User>();
		
		admins = (ArrayList<User>) users.stream().filter((s)->s.getRuolo().equals("admin")).collect(Collectors.toList());
		members = (ArrayList<User>) users.stream().filter((s)->s.getRuolo().equals("member")).collect(Collectors.toList());
		
		System.out.println(admins);
		System.out.println(members);
		
		
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		  
		List<Integer> subList = list.stream().filter(number -> number > 5 && number <10).collect(Collectors.toList());
		  
		System.out.println("Sottolista di interi maggiore di 5 e minore di 10:");
		subList.forEach(System.out::println);
		
		
		List<Integer> listaInput = new ArrayList<>();

		listaInput.add(1);
		listaInput.add(2);
		listaInput.add(3);
		listaInput.add(4);
		listaInput.add(5);

		List<Integer> listaOutput = transformList(listaInput, x -> x * 3);

		System.out.println("Lista di input: " + listaInput);
		System.out.println("Lista di output: " + listaOutput);
		
		List <Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 88);
		List<Integer> listapari = lista.stream().filter((s)-> s % 2 == 0).collect(Collectors.toList());
	     
	    System.out.println(listapari);
		
	    List <Integer> lista2 = Arrays.asList(1, 2, 3, 4, 5);
		int sommaLista = lista2.stream()
				.reduce(0, (num1, num2) -> num1+ num2);
		
		System.out.println(lista2.toString());
		System.out.println("somma lista: " +sommaLista);
	    
	    
		
	}

	public static List<Integer> transformList(List<Integer> inputList, Function<Integer, Integer> transformation) {
		return inputList.stream()
				.map(transformation)
				.collect(Collectors.toList());
	}
}
