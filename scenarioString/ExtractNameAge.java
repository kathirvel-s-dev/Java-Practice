package scenarioString;

public class ExtractNameAge {
	public static void main(String[] args) {
		String csv="Kathir,22,Chennai";
		String[] arr=csv.split(",");
		
		System.out.println("Name : "+arr[0]);
		System.out.println("Age : " + arr[1]);
		System.out.println("City : "+ arr[2]);
		
	}
}
