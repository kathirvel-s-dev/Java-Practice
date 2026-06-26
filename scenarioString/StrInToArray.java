package scenarioString;

public class StrInToArray {

	public static void main(String[] args) {
		String str="apple#banana#mango";
		String[] fruits= str.split("#");
		System.out.println(str.split("#")); // why this throws unknown chars
		
		for(String fruit : fruits) {
			System.out.println(fruit);
			
		}

	}

}
