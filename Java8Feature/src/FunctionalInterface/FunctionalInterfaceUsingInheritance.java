package FunctionalInterface;

@FunctionalInterface
interface Interf1{
	public void m1();

}

@FunctionalInterface
interface Interf2{
	public void m1();
	
}

interface Interf3 extends Interf2{		//This is not an Functinal Interface
	public void m2();
}


public class FunctionalInterfaceUsingInheritance {

	public static void main(String[] args) {
		 Interf1 i1 = () -> System.out.println("Interface 1");
		 
		 Interf1 i2 = () -> System.out.println("Interface 2");
		 
		 i1.m1();
		 i2.m1();
		 
		 

	}

}
