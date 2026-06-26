package scenarioString;

public class Equals {
	public static void main(String[] args) {
		String str="kathir";
		String str2="kathir";
		String str3=new String("kathir");
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3)); 
		
		//== this checks memory location 
		// but equals method checks value if both value same returns true 
	}
}
