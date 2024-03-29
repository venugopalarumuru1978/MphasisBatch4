package com.collection.maps;
import java.util.*;
import java.util.Map.Entry;
public class MapEx3 {

	public static void main(String[] args) {

		Map<Integer, String>  stdMap = new TreeMap<Integer,String>();
		
		stdMap.put(1005, "Kalyan Kumar");
		stdMap.put(1001, "Sravan Kumar");
		stdMap.put(1002, "Kiran Kumar");
		stdMap.put(1004, "Varun Kumar");
		stdMap.put(1003, "Pravasthi");
		
		System.out.println(stdMap);
		System.out.println("--------------------");
		
		for(Entry<Integer, String> stdinfo : stdMap.entrySet())
		{
			System.out.println(stdinfo);
			System.out.println("Key : " + stdinfo.getKey() + "\tValue : " + stdinfo.getValue());
		}
		
		System.out.println("--------");
		Set<Integer>  mapKeys = stdMap.keySet();
		System.out.println("Only Keys : " + mapKeys);
		
		Iterator itr = mapKeys.iterator();
		
		while(itr.hasNext())
		{
			int k = (int)itr.next();
			System.out.println("Key : " + k + "\tValue : " + stdMap.get(k));
		}
	}
}
