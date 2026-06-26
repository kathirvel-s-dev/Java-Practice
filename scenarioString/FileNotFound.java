package scenarioString;

public class FileNotFound {

	public static void main(String[] args) {
		String log="ERROR: File not found";
		String msg= log.substring(log.indexOf(":")+1).trim();
		System.out.println(msg);

	}

}
