package oops;
interface First{
	default void show() {
		System.out.println("default First");
	}
}
interface Second{
	default void show() {
		System.out.println("default Second");
	}
}

public class Diamond implements First,Second {
	public void show() {
		First.super.show();
		Second.super.show();
	}
	public static void main(String[] args) {
		Diamond d=new Diamond();
		d.show();

	}

}
