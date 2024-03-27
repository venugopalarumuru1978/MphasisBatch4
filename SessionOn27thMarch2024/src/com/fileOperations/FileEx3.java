package com.fileOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// writing data into a file
public class FileEx3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:\\FileTrans\\Test.txt", true);
		
		System.out.println("Enter some text ");
		String strinfo = sc.nextLine();
		
		strinfo = strinfo+"\n";
		
		fw.write(strinfo);
		
		fw.close();
		
		System.out.println("File Created...");
	}
}
