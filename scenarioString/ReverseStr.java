package scenarioString;

public class ReverseStr {

	public static void main(String[] args) {
		String name="kathir";
		String str="";
		for(int i=name.length()-1;i>=0;i--) { //length 6-1=5 ; 543210 ; 
			str= str+name.charAt(i);  // str="" +name.charAt(5) rihtak 
		}
		System.out.println(str);

	}

}
