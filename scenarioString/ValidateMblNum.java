package scenarioString;

public class ValidateMblNum {
	public static void main(String[] args) {
		String mobileNum="8796543210";
		
		 if(mobileNum.matches("\\d{10}")) {
			 System.out.println("Valid mobile number");
		 }else {
			 System.out.println("invalid mobile number");
		 }
	}
}
