package com.fileOperations;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File6 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Folder name ");
		String fname = sc.next();
		
		File fileObj = new File("C:\\FileTrans\\" + fname);
		
		if(fileObj.exists()==true)
			System.out.println("Folder is already exist");
		else
		{
			fileObj.mkdir();
			System.out.println("Folder Created...");
		}
	}
}
