package regularexp;
import java.util.*;
import java.util.regex.*;
public class Validation2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s[]=new String[1];
		System.out.println("Enter the email to be searched");
		s[0]=sc.next();
		System.out.println("Enter no. of employees");
		int n=sc.nextInt();
		String str[]=new String[n];
		System.out.println("Enter the employee emails");
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
	}
		
		System.out.println("Check validity of emails");
		
			Pattern ptr=Pattern.compile(s[0]);
			for(int j=0;j<n;j++) {
				Matcher m2=ptr.matcher(str[j]);
				boolean find=m2.find();
				if(find==true) {
					System.out.println(str[j]+" found at "+j+1);
					break;
				}
				}
			
	}
}

