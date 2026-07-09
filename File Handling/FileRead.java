package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		///folder creation
		/// 
//		File file =new File("/home/kathirvel/Desktop/Folder/Another");
//		boolean present=file.exists();
//		if(present== false) {
//			file.mkdirs();
//		}
		///
		/// file creation
//		File file=new File("/home/kathirvel/Desktop/one.text");
//		if(  file.exists()==false)
//		try {
//		 	boolean created	=file.createNewFile();
//		 	System.out.println("file created");
//		}catch(IOException ioe) {
//			ioe.printStackTrace();
//		}
		
		///file deletion
		/// 
//		File file=new File("/home/kathirvel/Desktop/one.text");
//		file.delete();
//		boolean present=file.exists();
//		System.out.println(present);
		
//		file renaming
		
//		File file=new File("/home/kathirvel/Desktop/one.text");
//		try {
//			file.createNewFile();
//		}catch(IOException ioe) {
//			System.out.println("not created");
//		}
//		
//		
//		File newName=new File("/home/kathirvel/Desktop/two.text");
//		boolean renamed=file.renameTo(newName);
//		System.out.println("file renamed: "+renamed);
		
//		file name
//		System.out.println("File name is : "+newName.getName());
//		System.out.println(newName.canExecute());
//		System.out.println(newName.canRead());
//		System.out.println(newName.canWrite());
		
//		listing files and folder
//		File file = new File("/home/kathirvel/Desktop");
//		String[] listing=file.list();
//		for(int i=0;i<listing.length;i++) {
//			System.out.println(listing[i]);
//		}
//		foreach 
//		for(String str:listing) {
//			if (str.contains(".")){
//				System.out.println(str);
//			}
//		}
		
//		listing files only 
//		File file=new File("/home/kathirvel/Desktop");
//		File[]  filesfolderslist=file.listFiles();
//		for (File f: filesfolderslist) {
//			if(f.isDirectory()) {
//				System.out.println(f);
//			}
//			
//		}
		
//		listing only .txt files 
		File file =new File("/home/kathirvel/Desktop");
		File[] filefolderarr=file.listFiles();
		for(File f: filefolderarr) {
			if(f.isFile()) {
				String filename=f.getName();
//				System.out.println(filename);
				int lastDot=filename.lastIndexOf(".");
//				System.out.println(lastDot);
				String extension =filename.substring(lastDot+1);
				if(extension.equals("txt"))
					if(f.length()>1)
						System.out.println(filename+" size : " + f.length());
			}
			
			
		}
		
	}

}
