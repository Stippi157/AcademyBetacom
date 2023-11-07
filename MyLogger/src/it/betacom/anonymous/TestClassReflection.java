package it.betacom.anonymous;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestClassReflection {
	String modalità = "veloce";
	
	public TestClassReflection() {
		super();
	}
	public TestClassReflection(String modalità) {
		super();
		this.modalità = modalità;
	}
	public void test() {
		System.out.println("Sono nel metodo test");
	}
	public void verifica(int i ) {
		System.out.println("Il valore di i è: " + i);
	}
	
		public static void main(String[] args) {
			TestClassReflection obj = new TestClassReflection();
			Class<? extends TestClassReflection> cls = obj.getClass();
			System.out.println("Il nome della classe è: " + cls.getName());
			
			Constructor[] constructor = cls.getConstructors();
			System.out.println("Lista dei costruttori: ");
			for (Constructor c: constructor) {
				System.out.println(c.getName());
			}
			
			Method[] methods = cls.getMethods();
			System.out.println("Lista dei metodi: ");
			for (Method m: methods) {
				System.out.println(m.getName());
			}
			
			try {
			Method method = cls.getMethod("test");
			method.invoke(obj);
			
			Method metodoVerifica = cls.getMethod("verifica", int.class);
			metodoVerifica.invoke(obj, 11);
			
			}
			catch(NoSuchMethodException e ){
				e.printStackTrace();
			}
			catch(SecurityException e){
				e.printStackTrace();
			} 
			catch (IllegalAccessException e) {
		
				e.printStackTrace();
			} 
			catch (IllegalArgumentException e) {
				
				e.printStackTrace();
			} 
			catch (InvocationTargetException e) {
				
				e.printStackTrace();
			}
		}
}
