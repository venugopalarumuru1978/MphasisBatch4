package com.collections.lists.Assignment;
import java.util.*;
public class PhoneBook {

	private List<Contact>  pbook = new ArrayList<Contact>();

	public List<Contact> getPbook() {
		return pbook;
	}

	public void setPbook(List<Contact> pbook) {
		this.pbook = pbook;
	}
	
	public void addContact(Contact contactObj)
	{
		pbook.add(contactObj);
	}
	public List<Contact> viewAllContacts()
	{
		return pbook;
	}
	
	public Contact viewContactGivenPhone(long phoneNumber)
	{
		Contact cnt = null;
		
		for(Contact c : pbook)
		{
			if(c.getPhoneNumber()==phoneNumber)
			{
				cnt = c;
				break;
			}
		}
		
		return cnt;
	}
	
	public boolean removeContact(long phoneNumber)
	{
		boolean cntChk = false;
		for(Contact c : pbook)
		{
			if(c.getPhoneNumber()==phoneNumber)
			{
				pbook.remove(c);
				cntChk = true;
				break;
			}
		}
		return cntChk;
	}
}
