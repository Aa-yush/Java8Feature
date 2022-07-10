package MethodAndConstructorReference;

class Sample1{
	public Sample1(String str) {
		System.out.println("Constructor call by "+ str);
	}
}

interface Interf1{
	public Sample1 get(String str);
}

public class ParameterizedConstructorReference {
	public static void main(String [] args) {
		Interf1 i = Sample1::new;
		System.out.println(i.get("Ayush Gupta"));
	}

}
