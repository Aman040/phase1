package multithreading;

public class MyTryCatch {

	public static void main(String[] args) {
		int array[]=new int[3];
		try {
			array[7]=3;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index  out of bound");
		}
		finally {
			System.out.println("Array length "+array.length);
		}
	}

}
