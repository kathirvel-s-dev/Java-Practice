package Compare;

import java.util.ArrayList;

import java.util.Collections;

public class CompareEmp {
	public static void main(String[] args) {
		ArrayList<Employees> al=new ArrayList<Employees>();
		al.add(new Employees("emp4", 22, "dev", 35000));
		al.add(new Employees("emp3", 24, "test", 30000));
		al.add(new Employees("emp1", 25, "devop", 33000));
		al.add(new Employees("emp2", 22, "dev", 40000));
		
//		System.out.println(al);
		Collections.sort(al);  //this sort method internally calls a compareto method 
		System.out.println(al);
		

	}
}
