package com.apps;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DAO.CricketDAO;
import com.beans.Cricket;

public class CrkMain {

	public static void main(String[] args) {
		ApplicationContext  fact = new ClassPathXmlApplicationContext("hiberdb.xml");
		CricketDAO  crkinfo = (CricketDAO)fact.getBean("crkObj"); 
		Scanner sc = new Scanner(System.in);
		Cricket crk = null;
		while(true)
		{
			System.out.println("1. Add Cricketer\n2. Show All Cricketers\n3. Search\n4. Update\n5. Delete\n6. Exit");
			System.out.println("Pick Ur Choice : ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				crk = new Cricket();
				System.out.println("Crickter ID : ");
				crk.setCrkid(sc.nextInt());
				System.out.println("Crickter Name : ");
				crk.setCrkname(sc.next());
				System.out.println("Crickter Runs : ");
				crk.setRuns(sc.nextInt());
				crkinfo.AddCricker(crk);
				break;
			case 2:
				List<Cricket> crklist = crkinfo.ShowAll();
				if(crklist.isEmpty())
					System.out.println("No Cricketer Details");
				else
				{
					for(Cricket c : crklist)
					{
						System.out.println(c.getCrkid() + "\t" + c.getCrkname() + "\t" + c.getRuns());
					}
				}
				break;
			case 3:
				System.out.println("Cricketer ID : ");
				int cid = sc.nextInt();
				crk = crkinfo.Search(cid);
				if(crk!=null)
					System.out.println(crk.getCrkid() + "\t" + crk.getCrkname() + "\t" + crk.getRuns());
				else
					System.out.println("Cricketer Not Found...");
				break;
			case 4:
				System.out.println("Cricketer ID : ");
				cid = sc.nextInt();
				crk = crkinfo.Search(cid);
				if(crk!=null)
				{
					System.out.println(crk.getCrkid() + "\t" + crk.getCrkname() + "\t" + crk.getRuns());
					System.out.println("Enter new name for Cricketer");
					crk.setCrkname(sc.next());
					crkinfo.UpdateCricketer(crk);
				}
				else
					System.out.println("Cricketer Not Found...");
				break;
			case 5:
				System.out.println("Cricketer ID : ");
				cid = sc.nextInt();
				crk = crkinfo.Search(cid);
				if(crk!=null)
				{
					System.out.println(crk.getCrkid() + "\t" + crk.getCrkname() + "\t" + crk.getRuns());
					System.out.println("Do u want to delete(y/N)");
					String chic = sc.next();
					if(chic.equalsIgnoreCase("Y"))
						crkinfo.DelCricketer(crk);
				}
				else
					System.out.println("Cricketer Not Found...");
				break;
			case 6:
				System.out.println("Thanks for using App");
				System.exit(0);
			}
		}	
	}
}
