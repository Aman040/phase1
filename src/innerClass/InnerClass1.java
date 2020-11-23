package innerClass;

public class InnerClass1 {
	
	private String  msg="Welcome";
			class Inner{
		void hello() {
			System.out.println(msg  +" Inner class");
		}
	}
	public static void main(String[] args) {
		InnerClass1 obj=new InnerClass1();
		InnerClass1.Inner inr=obj.new Inner();
		inr.hello();

	}

}
