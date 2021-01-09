package regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegexDemo {

	public static void main(String[] args) {
		String pattern="[a-z]+";
		String text="Happy Learning to Regex";
		String str[]=text.split("\\s");
		for(String s:str)
			System.out.print(s+ "-");
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(text);
		System.out.println(m.matches());
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+" "+Character.toLowerCase((text.charAt(m.start()-1)))+text.substring(m.start(),m.end()).toUpperCase());
		}
	}

}
