package MethodAndConstructorReference;

public class NonStaticMethodReference {
	
	public void m1() {
		for(int i = 0; i < 5; i++ ) {
			System.out.println("Thread - 1");
		}
	}
	public static void main(String[] args) {
		
		NonStaticMethodReference ns = new NonStaticMethodReference();
	 	Runnable r = ns::m1;
	 	Thread th = new Thread(r);
	 	th.start();
	 	
	 	for(int i = 0; i < 5; i++ ) {
			System.out.println("MainThread");
		}

	}

}
