package innerClass;

public class InnerClass2 {
	
	private String msg="Welcome";
	void display() {
		class Inner{
			
			void msg() {
				System.out.println(msg);
			}
		}
		Inner in=new Inner();
		in.msg();
	}
	public static void main(String[] args) {
		InnerClass2 obj=new InnerClass2();
		obj.display();
		

	}

}
