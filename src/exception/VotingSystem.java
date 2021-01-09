package exception;

public class VotingSystem {

	public static void main(String[] args) {
		int age=17;
		try {
			if(age<18) {
			throw new VotingAge("not eligible");
		}else {
			System.out.println("Valid age");
		}
		}
		catch(VotingAge vage) {
			vage.printStackTrace();
		}
	}

}
