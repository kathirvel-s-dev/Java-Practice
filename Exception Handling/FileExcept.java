

import java.io.File;
import java.io.IOException;
public class FileExcept {

	public static void main(String[] args) throws IOException{
		
		
			File file=new File("/home/kathirvel/Desktop/test.txt");
//			file.createNewFile();
//			String[] folder=file.list();
//			
//			for(String files : folder) {
//				if(files.contains("."))
//				System.out.println(files);
//			}
			System.out.println(file.canExecute());
			System.out.println(file.canRead());
			System.out.println(file.exists());
			System.out.println(file.hashCode());
			System.out.println(file.getName());

			file.canExecute();
		
		
	}

}
