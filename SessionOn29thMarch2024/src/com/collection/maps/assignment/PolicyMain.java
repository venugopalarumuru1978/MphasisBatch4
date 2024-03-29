package com.collection.maps.assignment;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;
public class PolicyMain {

	public static void main(String[] args) throws Exception {
		Policy  plcy = new Policy();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		while(true)
		{
			System.out.println("1. Add Policy\n2. View All\n3. Search Policy\n4. Exit");
			System.out.println("Pick Ur Choice : ");
			int ch =  Integer.parseInt(br.readLine());
			
			switch(ch)
			{
			case 1:
				System.out.println("Policy ID");
				int pid = Integer.parseInt(br.readLine());
				System.out.println("Policy Name");
				String pname = br.readLine();
				plcy.AddPolicy(pid, pname);
				break;
			case 2:
				Map<Integer, String>  mapPolicies = plcy.ViewAllPolicies();
				
				if(mapPolicies.isEmpty())
					System.out.println("No Policies Exist");
				else
				{
					for(Entry<Integer, String>  ens_ins : mapPolicies.entrySet())
					{
						System.out.println("| " + ens_ins.getKey() + " | " + ens_ins.getValue() + " | ");
					}
				}
				break;
			case 3:
				System.out.println("Policy Type : ");
				String ptype = br.readLine();
				List<Integer>  lstPids = plcy.searchBasedOnPolicyType(ptype);
				
				if(lstPids.isEmpty())
					System.out.println("No Policies with given Type");
				else
					System.out.println(lstPids);
				break;
			case 4:
				System.out.println("Thanks for using this App");
				System.exit(0);
			}
		}
	}
}
