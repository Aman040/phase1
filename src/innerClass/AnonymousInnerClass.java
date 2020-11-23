package innerClass;

abstract class AnonymousInner {
	abstract void display();
}
class InnerClass3 extends AnonymousInner{
	public void display() {
        System.out.println("Anonymous Inner Class");
     }
}
class AnonymousInnerClass{
	public static void main(String args[]) {
		AnonymousInner i=new InnerClass3();
		
      i.display();

	}
}
