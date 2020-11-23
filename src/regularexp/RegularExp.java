package regularexp;
import java.util.regex.*;
public class RegularExp {

	public static void main(String[] args) {
		String pattern="[a-z]+";
		String check="RegulaR ExprSssion";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(check);
		while(m.find()) {
			System.out.println(check.substring(m.start(),m.end()));
		}

	}

}
