package scenarioString;

public class CountOccurence {

	public static void main(String[] args) {
		String sentence=" Today is Thursday. Today is my day";
		
		String[] str=sentence.split("Today",-1);
		
		System.out.println(str);
		
		System.out.println(sentence.split("Today",-1).length-1); // why  -1  
		
		

	}

}
