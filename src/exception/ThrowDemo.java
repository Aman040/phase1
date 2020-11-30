package exception;

public class ThrowDemo {

	public static void main(String[] args) {
		int a=5,b=0, res=0;
		try {
			if(b==0)
				throw new ArithmeticException("Can't Divide by zero");
			else {
				res=a/b;
				System.out.println("Result is "+res);
			}
		}catch(ArithmeticException e) {
			System.out.println("\nThe result is "+e.getMessage());
		}
		finally {
			System.out.println("Result : "+res);
		}
		System.out.println("End Program");
	}

}
