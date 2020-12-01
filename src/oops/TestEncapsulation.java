package oops;
class Encapsulation{
	private String name;
	private int age;
	private int rollNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
}
public class TestEncapsulation {

	public static void main(String[] args) {
		Encapsulation encap=new Encapsulation();
		encap.setName("Aman");
		encap.setAge(24);
		encap.setRollNo(1503310024);
		System.out.println(encap.getName()+"\n"+encap.getAge()+"\n"+encap.getRollNo());
	}

}
