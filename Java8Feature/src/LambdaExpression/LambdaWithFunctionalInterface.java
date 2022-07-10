package LambdaExpression;

interface Interf{
	public void m1();
}

public class LambdaWithFunctionalInterface {
	public static void main(String [] args) {
		
		Interf i1 = () -> System.out.println("Method call");
		
		i1.m1();
	}
}
