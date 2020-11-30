package exception;

class MyExample extends Exception {
	String str;
	public MyExample(String str) {
		this.str=str;
	}
	public String toString() {
		return ("Exception Occured "+str);
	}
}
class MyException{
	public static void main(String[] args) {
		try {
			System.out.println("Starting try block");
			throw new MyExample("This is my error");
		}catch(MyExample e) {
			System.out.println("Catch block");
			System.out.println(e);
		}

	}

}
