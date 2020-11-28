package regularexp;

import java.util.*;
import java.util.regex.*;

public class EmailValidation {
   private static final String regex = "^(.+)@(.+)$";

   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   String s[]=new String[1];
		System.out.println("Enter the email to be searched");
		s[0]=sc.next();
		System.out.println("Enter no. of employees");
		int n=sc.nextInt();
       List<String> email = new ArrayList<String>();
       System.out.println("Enter the employee emails");
       for(int i=0;i<n;i++) {
       email.add(sc.next());
       }
       Pattern pattern = Pattern.compile(regex);
       for (String value : email) {
           Matcher matcher = pattern.matcher(value);

           System.out.println(value + " is " + (matcher.matches() ? "valid" : "invalid"));
       }
		Pattern ptr=Pattern.compile(s[0]);
		for(int j=0;j<email.size();j++) {
			Matcher m2=ptr.matcher(email.get(j));
			boolean find=m2.find();
			if(find==true) {
				System.out.println();
				System.out.println(email.get(j)+" found at "+(j+1));
				break;
			}
			}
		sc.close();
   }
}
