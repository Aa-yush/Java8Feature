package MethodAndConstructorReference;

class Sample{
	public Sample() {
		System.out.println("Sample Class Constructor");
	}
}

interface Interf{
	public Sample get();
}

public class ConstructorReference {

	public static void main(String[] args) {
		Interf i = Sample::new;
		Sample s = i.get();  	// Interface get method refers Sample class Constructor
		System.out.println(s);
	}
}
