package MethodAndConstructorReference;

public class StaticMethodReference {
	
	public static void m1() {
		for(int i = 0; i < 5; i++ ) {
			System.out.println("Thread - 1");
		}
	}
	
	public static void main(String [] args) {
		Runnable r = StaticMethodReference::m1;	// Static Method refers using className
		Thread th = new Thread(r);
		th.start();
		
		for(int i = 0; i < 5; i++ ) {
			System.out.println("Main Thread");
		}
	}

}
