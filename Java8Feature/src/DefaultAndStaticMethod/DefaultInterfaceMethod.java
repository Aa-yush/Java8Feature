package DefaultAndStaticMethod;

interface interf1{
	public default void m1() {
		System.out.println("m1() of interf1");
	}
}

interface interf2{
	public default void m1() {
		System.out.println("m1() of interf2");
	}
}

interface interf3{
	public default void m2() {
		System.out.println("m2() of interf3");
	}
}

class BaseClass implements interf1,interf2,interf3{
	public void m1() {
		interf1.super.m1();
		interf2.super.m1();
	}
}

public class DefaultInterfaceMethod {
	public static void main(String [] args) {
		BaseClass bc = new BaseClass();
		bc.m1();
		bc.m2();
	}

}
