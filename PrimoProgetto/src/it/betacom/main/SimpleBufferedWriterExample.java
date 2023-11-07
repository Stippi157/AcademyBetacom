package it.betacom.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleBufferedWriterExample {

	public static void main(String[] args) {

		String greetings = "Hello Matteo!";
		String description = "I am written into a file";

		try {
			File file = new File("./output/textfile.txt");
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter writer = new BufferedWriter(fileWriter);

			writer.write(greetings);
			writer.newLine();
			writer.write(description);
			writer.flush();
			writer.close();
			System.out.println("End");

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
