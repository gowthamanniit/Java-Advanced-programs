package javapro;

import java.util.*;
public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> hm=new HashMap<Integer,String>();
		hm.put(100,"Abi");
		hm.put(101,"hari");
		hm.put(107,"aaa");
		hm.put(102,"Mohammed");
		hm.put(103,"Antony");
		hm.put(null,"pritha");
		
		System.out.println(hm);

		for(Map.Entry m:hm.entrySet())    //Map.Entry is interface in hashMap
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		hm.remove(102);
		System.out.println("After remove:" +hm); //key based
		
		hm.remove(100,"Abi");
		System.out.println(hm);  //key and value
		
		hm.replace(101, "Karthick");
		System.out.println(hm);
		
		hm.replaceAll((k,v)->"vijay");
		System.out.println(hm);
		
		
	}

}

/*
It contains value based and unique keys, allows one null value and multiple null values, 
 inorder, initail capasity is 16. */