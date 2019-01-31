package binaryIO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryFile
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
		//long x = -2147483648;
		//int x = 1;
		//Integer y = 1;  // autoboxing Integer y === new Integer(1)
		//Integer y = new Integer(1); // Correct way to do it. Both are right.
		//int z = y;
		
		//System.out.println(Long.MAX_VALUE);
		//System.out.println(Long.MIN_VALUE);
		
		
		int[] numbers = {2, 4, 6, 8, 10, 12, 14};
		
		FileOutputStream fos;
		try{
		 fos = new FileOutputStream("numbers.dat");
		 DataOutputStream dos = new DataOutputStream(fos);
		 for(int num : numbers)
		 {
			 dos.writeInt(num);
		 }
		 dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done Writing!");
	}

}
