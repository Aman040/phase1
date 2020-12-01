package oops;
abstract class Shape{
	String color;
	abstract double area();
	public abstract String toString();
	public Shape(String Color) {
		System.out.println("Shape counstructor called");
		this.color=color;
	}
	public String getColor() {
		return color;
	}
}
class Circle extends Shape{
	double radius;
	public Circle(double radius,String color) {
		super(color);
		this.radius=radius;
	}
	double area() {
		return Math.PI*Math.pow(radius,2);
	}
	public String toString(){
		return "Circle color is "+super.color+"area is "+area();
	}
}
class Rectangle extends Shape{
	int len;
	int width;
	public Rectangle(int len,int width,String color) {
		super(color);
		this.len=len;
		this.width=width;
	}
	public double area() {
		return len*width;
	}
	public String toString() {
		return "Rectangle color is "+super.color +" area "+area();
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Shape s=new Circle(2,"red");
		Shape s2=new Rectangle(3,4,"black");
		System.out.println(s.toString());
		System.out.println(s2.toString());

	}

}
