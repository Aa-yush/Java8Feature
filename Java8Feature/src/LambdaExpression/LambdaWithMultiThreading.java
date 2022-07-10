package LambdaExpression;

public class LambdaWithMultiThreading {

	public static void main(String[] args) {
	
		Runnable r = () -> {
			for(int i = 1; i <= 10; i++ ) {
				System.out.println("Thread-1");
			}
				
		};
		Thread t = new Thread(r);
		t.start();
		for(int i = 1; i <= 10; i++ ) {
			System.out.println("Main Thread");
		}
		
	}

}
