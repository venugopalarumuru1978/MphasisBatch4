package com.FileOperations;
import java.util.*;
public class FileMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Student std = null;
		StudentOperations soper = new StudentOperations();
		while(true)
		{
			System.out.println("1. Add New Student\n2. View All Students\n3. Search Student\n4. Exit");
			System.out.println("Pick Ur Choice : ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				std = new Student();
				try
				{
				System.out.println("Roll Number : ");
				std.setRollno(sc.nextInt());
				System.out.println("Student Name : ");
				std.setStdname(sc.next());
				System.out.println("Student Corse : ");
				std.setCourse(sc.next());
				soper.AddNewStudent(std);
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
				break;
			case 2:
				try {
					soper.ShowAllStds();
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			case 3:
				try {
					System.out.println("Enter Roll Number : ");
					String rno = sc.next();
					String sresult = soper.SearchStd(rno);
					if(sresult!=null)
						System.out.println(sresult);
					else
						System.out.println("Student Not Found...");
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			case 4:
				System.out.println("Thanks for using this app");
				System.exit(0);
			}
		}
	}
}
