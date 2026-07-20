package SetandMap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
//		LinkedList ll=new LinkedList(); //comparing to arraylist ,linkedlist is more powerful for add elements and deletion of elements
//		ll.add(10);
//		ll.add("hello");
//		System.out.println(ll);
		
//		HashSet hs=new HashSet();
//		hs.add(10);
//		hs.add(20);
//		hs.add(30);
//		hs.add(10);
//		hs.add("hello");
//		
//		System.out.println(hs);
		
		
//		LinkedHashSet lhs=new LinkedHashSet(); //insertion order is maintained with no duplicate elements
//		lhs.add(10);
//		lhs.add(20);
//		lhs.add(30);
//		lhs.add(10);
//		lhs.add("end");
//		System.out.println(lhs);
		
		
		TreeSet ts=new TreeSet();  //allowed only same datatype elements with ascending order , without duplicates
		ts.add(1);
		ts.add(0);
		ts.add(7);
//		ts.add("complete");
		System.out.println(ts);
		
		
		
		

	}

}
