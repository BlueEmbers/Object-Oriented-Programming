package binaryIO;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("numbers.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		/*int x = dis.readInt();
		System.out.println(x);*/
		
		/*for (int i = 0; i < 7; i++) {
			int x = dis.readInt();
			System.out.println(x);
		}*/
		boolean endOfFile = false;
		
		while (!endOfFile) {
			try {
				int x = dis.readInt();
				System.out.println(x);
			} catch (EOFException e) {
				// TODO Auto-generated catch block
				endOfFile = true;
			}
		}
		dis.close();
		System.out.println("Done Reading!");
	

	}

}
