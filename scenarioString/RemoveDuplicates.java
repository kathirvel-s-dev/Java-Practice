package scenarioString;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str="aabbccdd";
		String result="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i); //a a b b c c d d 
			
			if (result.indexOf(ch)== -1){
				result +=ch;
				
			}
			
			
		}
		
		
		
	}
}
