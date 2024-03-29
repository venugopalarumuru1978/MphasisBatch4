package com.collection.maps.assignment;
import java.util.*;
import java.util.Map.Entry;
public class Policy {

	private Map<Integer, String>  ins_poly = new TreeMap<Integer,String>();
	
	public void AddPolicy(int pno, String pname)
	{
		ins_poly.put(pno, pname);
	}
	
	public Map<Integer, String>  ViewAllPolicies()
	{
		return ins_poly;
	}
	
	public List<Integer> searchBasedOnPolicyType(String ptype)
	{
		List<Integer>  lstPid = new ArrayList<Integer>();
		
		for(Entry<Integer, String>  ens_ins : ins_poly.entrySet())
		{
			String pname = ens_ins.getValue();
			if(pname.contains(ptype))
				lstPid.add(ens_ins.getKey());
		}
		
		return lstPid;
	}
}
