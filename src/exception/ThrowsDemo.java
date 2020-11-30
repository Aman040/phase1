package exception;

public class ThrowsDemo {
	void division()throws ArithmeticException{
		int a=5,b=0,res=0;
		res=a/b;
		System.out.println("/n Result is: "+res);
	}
	public static void main(String[] args) {
		ThrowsDemo td=new ThrowsDemo();
		try {
			td.division();
		}catch(ArithmeticException e) {
			System.out.println("\nError "+ e.getMessage());
		}
		
		System.out.println("End Program");
	}

}
