package method;

public class MethodExample {
	public int multiplynum(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		MethodExample md=new MethodExample();
		int r=md.multiplynum(3,10);
		System.out.println(r);

	}

}
