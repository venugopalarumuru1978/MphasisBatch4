package com.fileOperations;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File7 {

	public static void main(String[] args) throws IOException {
		File fileObj = new File("C:\\FileTrans");
		String fcontent[] = fileObj.list();
		
		int fcount = 0, fdrcount=0; 
		for(String f : fcontent)
		{
			System.out.println(f);
			File tempObj = new File("C:\\FileTrans\\" + f);
			if(tempObj.isFile())
				fcount++;
			if(tempObj.isDirectory())
				fdrcount++;
		}
		
		System.out.println("No of Files : " + fcount);
		System.out.println("No of Folders : " + fdrcount);
	}
}
