package com.fileOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// writing data into a file
public class FileEx1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("C:\\FileTrans\\Demo.txt");
		
		System.out.println("Enter some text ");
		String strinfo = sc.nextLine();
		
		byte fileinfo[] = strinfo.getBytes();
		
		fos.write(fileinfo);
		
		fos.close();
		
		System.out.println("File Created...");
	}
}
