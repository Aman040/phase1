package oops;

public class Dogs {
	String name;
	String breed;
	int age;
	String color;
	
	public Dogs(String name, String breed, int age, String color) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public String getColor() {
		return color;
	}
	public int getAge() {
		return age;
	}
	public String toString(){
		return ("Hi my name is "+this.getName()+"\n My breed ,age and color are "+this.getBreed()+","+this.getAge()+","+this.getColor());
	}
	public static void main(String[] args) {
		Dogs sscott=new Dogs("Scott","papillion",3,"white"); 
		System.out.println(sscott.toString());
	}
	

}
