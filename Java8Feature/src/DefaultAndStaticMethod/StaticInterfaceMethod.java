package DefaultAndStaticMethod;

interface interf4{
	public static void m1() {
		System.out.println("static m1() of interf4");
	}
}

public class StaticInterfaceMethod {

	public static void main(String[] args) {
		interf4.m1();
	}

}
