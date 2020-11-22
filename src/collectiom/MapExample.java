package collectiom;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap<>();
		hmap.put(101,"Aman");
		hmap.put(103, "Anand");
		hmap.put(102, "Anu");
		hmap.put(112, "Anu");
		for(Map.Entry<Integer,String> m:hmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		Hashtable<Integer,String> hma=new Hashtable<>();
		hma.put(104,"Aman");
		hma.put(106, "Anand");
		hma.put(105, "Anu");
		hma.put(110, "Anu");
		for(Map.Entry<Integer,String> m:hma.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		TreeMap<Integer,String> hm=new TreeMap<>();
		hm.put(107,"Aman");
		hm.put(109, "Anand");
		hm.put(108, "Anu");
		hm.put(111, "Anu");
		for(Map.Entry<Integer,String> m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
