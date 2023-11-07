package Util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {
	
	public static int dividi(int a, int b) {
		
		return a/b;
		
	}
	public static Properties caricaProprieta(InputStream inputStream) throws IOException {
		Properties properties = new Properties();
		properties.load(inputStream);
		
		return properties;
	}

}
