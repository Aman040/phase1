package strings;

public class StringMethods {

	public static void main(String[] args) {
		System.out.println("Methods of Strings");
		String str=new String("Welcome");
		System.out.println(str.length());
		String sub=new String("Welcome");
		System.out.println(sub.substring(2,4));
		String s1="Hello";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));
		String s4="";
		System.out.println(s4.isEmpty());
		String s5="TOLowerCASE";
		System.out.println(s5.toLowerCase());
		String s6="Heldo";
		String replace=s6.replace('d', 'l');
		System.out.println(replace);
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));
		System.out.println("\nCreating StringBuffer");
		StringBuffer s=new StringBuffer("Welcome to java ");
		s.append("Enjoy your learning");
		System.out.println(s);
		s.insert(0,'w');
		System.out.println(s);
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2,"HEL");
		System.out.println(sb);
		System.out.println("\nCreating string builder");
		StringBuilder sbl=new StringBuilder("Happy");
		sbl.append(" Learning");
		System.out.println(sbl);
		System.out.println(sbl.delete(0,1));
		System.out.println(sbl.insert(1, "Welcome"));
		System.out.println(sbl.reverse());
		System.out.println("\nConversion of String to StringBuffer");
		String s7="Hello";
		StringBuffer sbr=new StringBuffer(s7);
		System.out.println(sbr.reverse());
		System.out.println("\nString to StringBuilder");
		System.out.println(sbr);
		StringBuilder subl=new StringBuilder(s7);
		subl.append("world");
		System.out.println(subl);
	}
}
