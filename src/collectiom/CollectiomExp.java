package collectiom;
import java.util.*;
public class CollectiomExp {

	public static void main(String[] args) {
		System.out.println("Array List");
		ArrayList<String> l1=new ArrayList<>();
		l1.add("Delhi");
		l1.add("Bangalore");
		System.out.println(l1);
		System.out.println("\n Vector");
		Vector<Integer> l2=new Vector<>();
		l2.add(10);
		l2.add(20);
		l2.add(15);
		System.out.println(l2);
		System.out.println("\n LinkedList");
		LinkedList<Integer> l3=new LinkedList<>();
		l3.add(10);
		l3.add(5);
		l3.add(15);
		Iterator<Integer> itr=l3.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(" \n HashSet ");
		HashSet<Integer> set=new HashSet<>();
		set.add(101);  
	    set.add(103);  
	    set.add(102);
	    set.add(102);
	    System.out.println(set);
	    System.out.println(" \n LinkedHashSet");
	    LinkedHashSet<Integer> set2=new LinkedHashSet<>();
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(12);	       
	       System.out.println(set2);
	}

}
