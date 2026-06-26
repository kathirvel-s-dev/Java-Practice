package scenarioString;

public class Emailcontains {

	public static void main(String[] args) {
		String email="kathir@gmail.com";
		if(email.contains("@") && email.contains(".")) {
			System.out.println("valid email");
		}
	}

}
