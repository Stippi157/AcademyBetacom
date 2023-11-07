package it.betacom.main;

public class GenericsMainDemo {

	public static void main(String[] args) {
		
		class Demo{
			public <T> void genericMethod(T data) {
				System.out.println(data);
			}
		}
		
		Demo demo = new Demo();
		demo.genericMethod("SanPietro aiutami tu");
		demo.genericMethod(27);
		
		GenericClass<Integer> c = new GenericClass<Integer>(5);
		GenericClass<String> s = new GenericClass<String>("Dio aiutami");
		System.out.println("Oggetti creati: " + c + " " + s);
		
	}
}
