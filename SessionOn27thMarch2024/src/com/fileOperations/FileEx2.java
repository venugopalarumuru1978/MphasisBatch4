package com.fileOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// read data from a file
public class FileEx2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("C:\\FileTrans\\Demo.txt");
		
		int ch = fis.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch = fis.read();
		}
		//System.out.println("File Size : " + fis.available());
		fis.close();
	}
}
