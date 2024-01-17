package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	public static void CreateFile(String Name)
	{
		File ff = new File(Name);
		try {
			ff.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("File is created successfully..........");
		
	}
	
	public static void WriteFile(String Name)
	{
		
		FileWriter fw;
		try {
			fw = new FileWriter("Anu.txt");
			
			System.out.println("Write details in file successful........");
			
		} catch (IOException e1) {
			
			System.out.println("Unexpected Error...");
		}
		
	}
	
	public static void main(String[] args) {
		
//		Demo d = new Demo();
//		CreateFile("Anu");
		WriteFile("Anu......You are the best");
		
	}

}
