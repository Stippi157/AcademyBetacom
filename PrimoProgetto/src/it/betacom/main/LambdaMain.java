package it.betacom.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaMain {

	public static void main(String[] args) {
//		 List<Integer> numbers = Arrays.asList(3,2,1,4,5);
//		 Collections.sort(numbers, (Integer o1, Integer o2) -> {
//			 return o1.compareTo(o2);
//		 });
//		 for(Integer number : numbers) {
//			 System.out.println(number);
//		 }
		
		List<String> lista = Arrays.asList("Marco","Antonio","Giuseppe");
		lista.stream().filter((s)->s.startsWith("M")).forEach(System.out::println);
		
	}

}
