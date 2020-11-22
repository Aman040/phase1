package constructor;

public class ConstructorExample {
	int i;
	String s;
	public ConstructorExample()
	{
		
	}
	public ConstructorExample(int id,String name) {
		i=id;
		s=name;
	}
	public void display()
	{
		System.out.println(i+ " " +s);
	}
	public static void main(String[] args) {
		ConstructorExample ce1=new ConstructorExample();
		ConstructorExample ce2=new ConstructorExample(1,"Aman");
		ce1.display();
		ce2.display();

	}

}
