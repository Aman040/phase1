package phase1;

class PrivateAccessSpeifier{
	private void display() {
		System.out.println(" private access specifier");
	}
}
public class AccessSpecifier2 {

	public static void main(String[] args) {
		System.out.println("Private access modifier");
		PrivateAccessSpeifier obj=new PrivateAccessSpeifier();
		//obj.display();
		//The method display() from the type PrivateAccessSpeifier is not visible
	}

}
