package phase1;

class DefAccessSpecifier{
	void display() {
		System.out.println("This class have default access specifier");
	}
}

public class AccessSpecifier1 {

	public static void main(String[] args) {
		System.out.println("Default access modifier");
		DefAccessSpecifier def=new DefAccessSpecifier();
		def.display();
		
		
	}

}
