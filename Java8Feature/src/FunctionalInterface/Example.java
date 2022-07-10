package FunctionalInterface;

@FunctionalInterface
interface Interf{
	public void m1();
	
	 public static void m2() {
		 
	 }
	 
	 public default void m3() {
		 
	 }
}

public class Example {
	public static void main(String [] args) {
	
	Interf in = () -> {
		System.out.println("Functional Interface");
	};
	
	in.m1();
	}

}
