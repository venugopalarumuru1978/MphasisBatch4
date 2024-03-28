package com.FileOperations;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class StudentOperations {

	private FileWriter fwstd = null;
	private FileReader frstd = null;
		
	public void AddNewStudent(Student std) throws IOException
	{
		fwstd = new FileWriter("C:\\FileTrans\\Student.txt", true);
		String result = std.getRollno() + "\t" + std.getStdname() + "\t" + std.getCourse() + "\n";
		fwstd.write(result);	
		fwstd.close();
		System.out.println("Student Details are Added Successfully...");
	}
	
	public void ShowAllStds() throws IOException
	{
		frstd = new FileReader("C:\\FileTrans\\Student.txt");
		BufferedReader br = new BufferedReader(frstd);
		String str = br.readLine();
		while(str!=null)
		{
			System.out.println(str);
			str = br.readLine();
		}
		
		frstd.close();
	}
	
	public String SearchStd(String rno) throws IOException
	{
		String stdinfo = null;
		frstd = new FileReader("C:\\FileTrans\\Student.txt");
		BufferedReader br = new BufferedReader(frstd);
		String str = br.readLine();
		while(str!=null)
		{
			if(str.contains(rno)==true)
			{
				stdinfo = str;
				break;
			}	
			str = br.readLine();
		}
		
		frstd.close();
		return stdinfo;
	}
}
