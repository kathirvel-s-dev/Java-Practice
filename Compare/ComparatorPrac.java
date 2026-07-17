package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorPrac implements Comparator<Integer> {//for which class we have to compare we have mention that generic class such as string or int else 

	public static void main(String[] args)   {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(7);
//		System.out.println(al);
		Collections.sort(al,new ComparatorPrac()); //we have to pass the object for this 
		System.out.println(al);
		
	}

	@Override
	public int compare(Integer el1, Integer el2) {
		
		System.out.println(el1+" "+ el2);
		if (el1>el2) {
			return -1;
		}else if(el1<el2) {
			return 1;
		}else {
			return 0;
		}
	}
	
	

}
