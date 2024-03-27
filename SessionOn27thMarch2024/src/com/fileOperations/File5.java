package com.fileOperations;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File5 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name ");
		String fname = sc.next();
		
		File fileObj = new File("C:\\FileTrans\\" + fname);
		
		if(fileObj.exists()==true)
			System.out.println("File is already exist");
		else
		{
			fileObj.createNewFile();
			System.out.println("File Created...");
		}
	}
}
