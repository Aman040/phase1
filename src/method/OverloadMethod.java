package method;

public class OverloadMethod {
	public void area(int b,int h) {
		System.out.println("Area of traingle" + 0.5*b*h);
	}
	public void area(int r)
	{
		System.out.println("Area of circle" + 3.14*r*r);
	}
	public static void main(String[] args) {
		OverloadMethod om=new OverloadMethod();
		om.area(10, 10);
		om.area(7);

	}

}
