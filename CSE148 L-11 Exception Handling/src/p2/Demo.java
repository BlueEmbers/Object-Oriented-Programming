package p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException{
		//PrintWriter pw = new PrintWriter("newNames.txt");
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a file name to open: ");
		String fileName = kb.nextLine();
		File file = new File("c:\\" + fileName);
		Scanner fileScanner = null;
		boolean fileNotFound = false;
		try{
			fileScanner = new Scanner(file);
			fileNotFound = false;
		}
		catch (FileNotFoundException e)
		{
			System.out.println("The file is not found");
		}
		while(fileNotFound);
		while(fileScanner.hasNext())
				{
			System.out.println(fileScanner.nextLine());
				}
	
		System.out.println("Done!");
		
	}

}
