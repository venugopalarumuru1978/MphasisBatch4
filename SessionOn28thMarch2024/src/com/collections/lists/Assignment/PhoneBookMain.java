package com.collections.lists.Assignment;
import java.util.*;
public class PhoneBookMain {

	public static void main(String[] args) {
	
		PhoneBook pb = new PhoneBook();
		Contact cnt = null;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Add Contact\n2. View All Contacts\n3. Search Contact\n4. Remove Contact\n5. Exit");
			System.out.println("Pick Ur Choice : ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				cnt = new Contact(null, null, 0, null);
				System.out.println("First Name :");
				cnt.setFirstName(sc.next());

				System.out.println("Last Name :");
				cnt.setLastName(sc.next());
				
				System.out.println("Phone Number :");
				cnt.setPhoneNumber(sc.nextLong());

				System.out.println("Email :");
				cnt.setEmailId(sc.next());
				pb.addContact(cnt);
				System.out.println("Contact is Added...");
				break;
			case 2:
				List<Contact>  cntlist = pb.viewAllContacts();
				
				if(cntlist.size()!=0)
				{
					for(Contact c : cntlist)
						System.out.println(c.getFirstName() + "\t" + c.getLastName() + "\t" + c.getPhoneNumber() + "\t" + c.getEmailId());
				}
				else
					System.out.println("No Contacts");
				break;
			case 3:
				System.out.println("Enter Phone Number ");
				long ph = sc.nextLong();
				cnt = pb.viewContactGivenPhone(ph);
				if(cnt!=null)
					System.out.println(cnt.getFirstName() + "\t" + cnt.getLastName() + "\t" + cnt.getPhoneNumber() + "\t" + cnt.getEmailId());
				else
					System.out.println("Contact Not Found...");
				break;
			case 4:
				System.out.println("Enter Phone Number ");
				ph = sc.nextLong();
				cnt = pb.viewContactGivenPhone(ph);
				if(cnt!=null)
				{
					boolean b = pb.removeContact(ph);
					if(b==true)
						System.out.println("Contact Deleted...");
				}
				else
					System.out.println("Contact Not Found...");
				break;
			case 5:
				System.out.println("Thanks for using this App");
				System.exit(0);
			}
		}
	}
}
